class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Reverse_a_Circular_Linked_List {
    public void reverse(Node head) {
        if (head.next == null) return;
        Node a = head.next;
        head.next = null;
        reverse(a);
        a.next = head;
    }
    public Node reverseCircular(Node head) {
        Node temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = null;
        reverse(head);
        head.next = temp;
        return temp;
    }
}