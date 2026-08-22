class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class Add_Number_Linked_Lists {
    Node reverse(Node head) {
        if (head == null || head.next == null) return head;
        Node a = head.next;
        head.next = null;
        Node b = reverse(a);
        a.next = head;
        return b;
    }
    public Node addTwoLists(Node head1, Node head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node t3 = dummy;
        int carry = 0;
        while (t1 != null && t2 != null) {
            Node temp = new Node((t1.data + t2.data + carry) % 10);
            carry = (t1.data + t2.data + carry) / 10;
            t3.next = temp;
            t3 = temp;
            t1 = t1.next;
            t2 = t2.next;
        }
        while (t1 != null) {
            Node temp = new Node((t1.data + carry) % 10);
            carry = (t1.data + carry) / 10;
            t3.next = temp;
            t3 = temp;
            t1 = t1.next;
        }
        while (t2 != null) {
            Node temp = new Node((t2.data + carry) % 10);
            carry = (t2.data + carry) / 10;
            t3.next = temp;
            t3 = temp;
            t2 = t2.next;
        }
        if (carry != 0) {
            t3.next = new Node(carry);
        }
        Node ans = reverse(dummy.next);
        while (ans.next != null && ans.data == 0) {
            ans = ans.next;
        }
        return ans;
    }
}