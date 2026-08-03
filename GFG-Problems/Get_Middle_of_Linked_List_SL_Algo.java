class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Get_Middle_of_Linked_List_SL_Algo {
    // Slow and Fast Pointer Algorithm
    int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        // Check fast != null first to avoid NullPointerException while accessing fast.next
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}