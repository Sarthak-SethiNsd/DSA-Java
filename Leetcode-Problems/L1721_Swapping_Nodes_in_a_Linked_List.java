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
public class L1721_Swapping_Nodes_in_a_Linked_List {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = head;
        ListNode end = head;
        ListNode fast = head;
        for (int i = 1; i <= k; i++) {
            fast = fast.next;
            if (i != k) {
                start = start.next;
            }
        }
        while (fast != null) {
            end = end.next;
            fast = fast.next;
        }
        int temp = start.val;
        start.val = end.val;
        end.val = temp;
        return head;
    }
}