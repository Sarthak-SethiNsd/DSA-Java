class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class L83_Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode t1 = dummy;
        ListNode temp = head;
        while (temp != null) {
            t1.next = temp;
            t1 = temp;
            ListNode t2 = temp;
            while (t2 != null && t2.val == temp.val) t2 = t2.next;
            temp.next = t2;
            temp = t2;
        }
        return dummy.next;
    }
}