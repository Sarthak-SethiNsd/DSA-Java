class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class L328_Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode evenhead = null, eventail = null;
        ListNode oddhead = null, oddtail = null;
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (oddhead == null) {
                oddhead = oddtail = temp;
            } else {
                oddtail.next = temp;
                oddtail = temp;
            }
            temp = temp.next;
            if (evenhead == null) {
                evenhead = eventail = temp;
            } else {
                eventail.next = temp;
                eventail = temp;
            }
            temp = temp.next;
        }
        if (temp != null) {
            oddtail.next = temp;
            oddtail = temp;
        }
        oddtail.next = evenhead;
        eventail.next = null;
        return oddhead;
    }
}