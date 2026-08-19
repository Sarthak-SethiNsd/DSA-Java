class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Reorder_Linked_List {
    // Find the middle, reverse the second half recursively, and merge both halves alternately
    public void reorderList(Node head) {
        if (head == null || head.next == null || head.next.next == null) return;
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node bpart = slow.next;
        slow.next = null;
        bpart = reverseList(bpart);
        Node a = head;
        Node b = bpart;
        while (b != null) {
            Node temp1 = a.next;
            Node temp2 = b.next;
            a.next = b;
            b.next = temp1;
            a = temp1;
            b = temp2;
        }
    }
    Node reverseList(Node head) {
        if (head == null || head.next == null) return head;
        Node a = head.next;
        head.next = null;
        Node b = reverseList(a);
        a.next = head;
        return b;
    }
}