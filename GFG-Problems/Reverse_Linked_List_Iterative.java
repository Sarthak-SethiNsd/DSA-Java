class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Reverse_Linked_List_Iterative {
    // Reverse the linked list iteratively using three pointers: pre, curr, and forw
    Node reverseList(Node head) {
        if (head.next == null) return head;
        Node pre = null;
        Node curr = head;
        Node forw = null;
        while (curr != null) {
            forw = curr.next;
            curr.next = pre;
            pre = curr;
            curr = forw;
        }
        return pre;
    }
}