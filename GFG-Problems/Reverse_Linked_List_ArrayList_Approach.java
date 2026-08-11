import java.util.*;
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Reverse_Linked_List_ArrayList_Approach {
    // Reverse Linked List using ArrayList
    Node reverseList(Node head) {
        ArrayList<Node> arr = new ArrayList<>(); // Store all nodes in an ArrayList
        Node temp = head;
        while (temp != null) {
            arr.add(temp);
            temp = temp.next;
        }
        int n = arr.size();
        for (int i = n - 1; i > 0; i--) {
            arr.get(i).next = arr.get(i - 1);
        }
        arr.get(0).next = null;
        return arr.get(n - 1);
    }
}