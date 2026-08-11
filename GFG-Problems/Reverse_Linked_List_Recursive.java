class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Reverse_Linked_List_Recursive {
    // Reverse the linked list recursively 
    Node reverseList(Node head) {
        if (head.next == null) return head;
        Node a = head.next;
        head.next = null;
        Node b = reverseList(a);
        a.next = head;
        return b;
    }
}