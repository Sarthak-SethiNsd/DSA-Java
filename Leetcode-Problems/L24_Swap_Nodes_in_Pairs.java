class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class L24_Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        int cnt = 0;
        ListNode temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        ListNode newHead = head.next;
        ListNode prev = null;
        ListNode t1 = head;
        ListNode t2 = head.next;
        for (int i = 1; i <= cnt - 1; i += 2) {
            t1.next = t2.next;
            t2.next = t1;
            if (prev != null) prev.next = t2;
            prev = t1;
            t1 = t1.next;
            if (t1 != null) t2 = t1.next;
        }
        return newHead;
    }
}