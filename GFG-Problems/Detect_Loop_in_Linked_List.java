class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Detect_Loop_in_Linked_List {
    // Floyd's Cycle Detection (Tortoise and Hare) Algorithm
    public boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}