class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class L2130_Maximum_Twin_Sum_of_a_Linked_List {
    public int pairSum(ListNode head) {
        if (head.next.next == null) return head.val + head.next.val;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        ListNode pre = null;
        ListNode forw = null;
        slow.next = null;
        while (curr != null) {
            forw = curr.next;
            curr.next = pre;
            pre = curr;
            curr = forw;
        }
        ListNode i = head;
        ListNode j = pre;
        int ans = -1;
        while (j != null) {
            ans = Math.max(ans, i.val + j.val);
            i = i.next;
            j = j.next;
        }
        return ans;
    }
}