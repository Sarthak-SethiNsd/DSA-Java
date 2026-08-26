class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Deletion_in_Circular_Linked_List {
    Node deleteNode(Node head, int key) {
        if (head.data == key) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            return head.next;
        }
        Node temp = head;
        while (temp.next != head) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
}