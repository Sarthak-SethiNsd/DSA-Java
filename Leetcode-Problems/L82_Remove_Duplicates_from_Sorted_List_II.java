class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class L82_Remove_Duplicates_from_Sorted_List_II {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                int value = curr.val;
                while (curr != null && curr.val == value) {
                    curr = curr.next;
                }
                prev.next = curr;
            } 
            else {
                prev = curr;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}