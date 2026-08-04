class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Find_the_First_Node_of_Loop_in_Linked_List {
    // Floyd's Cycle Detection Algorithm
    public int cycleStart(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        // No cycle exists
        if (fast == null || fast.next == null) {
            return -1;
        }
        Node ans = head;
        while (ans != slow) {
            ans = ans.next;
            slow = slow.next;
        }
        return ans.data;
    }
}