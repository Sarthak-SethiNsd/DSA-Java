class L876_Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        // Using Floyd's Slow-Fast Pointer Method
        if (head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}