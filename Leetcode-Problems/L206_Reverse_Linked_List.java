class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class L206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode curr = head;
        ListNode frd = null;
        while (curr != null) {
            frd = curr.next;
            curr.next = pre;
            pre = curr;
            curr = frd;
        }
        return pre;
    }
}