class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
public class Kth_Node_From_End_of_Linked_List_SL_Algo {
    // Slow and Fast Pointer Algorithm
    public int getKthFromLast(Node head, int k) {
        Node slow = head;
        Node fast = head;
        // Move fast pointer k steps ahead
        for (int i = 1; i <= k; i++) {
            if (fast == null) return -1;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}