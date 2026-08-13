class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class L61_Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int cnt = 0;
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
            cnt++;
        }
        cnt++;
        k = k % cnt;
        if (k == 0) return head;
        ListNode t1 = head;
        for (int i = 1; i < cnt - k; i++) {
            t1 = t1.next;
        }
        ListNode ans = t1.next;
        t1.next = null;
        temp.next = head;
        return ans;
    }
}