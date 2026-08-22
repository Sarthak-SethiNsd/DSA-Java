class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class L92_Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null || left == right) return head;
        ListNode pre = head;
        ListNode ata = head;
        ListNode atb = head;
        ListNode forw = head;
        if (left == 1) {
            ata = head;
        } else {
            for (int i = 1; i < left - 1; i++) {
                pre = pre.next;
                ata = ata.next;
            }
            ata = ata.next;
        }
        for (int i = 1; i < right; i++) {
            forw = forw.next;
            atb = atb.next;
        }
        forw = forw.next;
        ListNode oldAta = ata;
        ListNode newHead = reverse(ata, atb);
        oldAta.next = forw;
        if (left == 1) {
            head = newHead;
        } else {
            pre.next = newHead;
        }
        return head;
    }
    ListNode reverse(ListNode a, ListNode b) {
        ListNode prev = null;
        ListNode curr = a;
        ListNode stop = b.next;
        while (curr != stop) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}