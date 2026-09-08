class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class L2181_Merge_Nodes_in_Between_Zeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode t1 = dummy;
        ListNode temp = head.next;
        while (temp != null) {
            int ans = 0;
            while (temp.val != 0) {
                ans += temp.val;
                temp = temp.next;
            }
            ListNode t2 = new ListNode(ans);
            t1.next = t2;
            t1 = t2;
            temp = temp.next;
        }
        return dummy.next;
    }
}