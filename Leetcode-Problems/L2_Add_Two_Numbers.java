class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class L2_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode d = new ListNode(-1);
        ListNode t3 = d;
        ListNode t1 = l1;
        ListNode t2 = l2;
        while (t1 != null && t2 != null) {
            ListNode temp = new ListNode((t1.val + t2.val + carry) % 10);
            t3.next = temp;
            t3 = temp;
            carry = (t1.val + t2.val + carry) / 10;
            t1 = t1.next;
            t2 = t2.next;
        }
        while (t1 != null) {
            ListNode temp = new ListNode((t1.val + carry) % 10);
            t3.next = temp;
            t3 = temp;
            carry = (t1.val + carry) / 10;
            t1 = t1.next;
        }
        while (t2 != null) {
            ListNode temp = new ListNode((t2.val + carry) % 10);
            t3.next = temp;
            t3 = temp;
            carry = (t2.val + carry) / 10;
            t2 = t2.next;
        }
        if (carry != 0) {
            ListNode temp = new ListNode(carry);
            t3.next = temp;
            t3 = temp;
        }
        t3.next = null;
        return d.next;
    }
}