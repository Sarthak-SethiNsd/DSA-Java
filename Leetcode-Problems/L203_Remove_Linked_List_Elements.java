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

public class L203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val != val) {
                t.next = temp;
                t = temp;
            }
            temp = temp.next;
        }
        t.next = null;
        return dummy.next;
    }
}