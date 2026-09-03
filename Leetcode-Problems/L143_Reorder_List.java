class L143_Reorder_List {
    ListNode reverse(ListNode head) {
        if (head.next == null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverse(a);
        a.next = head;
        return b;
    }
    public void reorderList(ListNode head) {
        if (head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode dummy = new ListNode(-1);
        ListNode t1 = dummy;
        ListNode t2 = head;
        ListNode t3 = head2;
        while (t3 != null) {
            t1.next = t2;
            t1 = t2;
            t2 = t2.next;
            t1.next = t3;
            t1 = t3;
            t3 = t3.next;
        }
        if (t2 != null) {
            t1.next = t2;
            t1 = t2;
            t1.next = null;
        }
    }
}