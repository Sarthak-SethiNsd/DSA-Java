class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Kth_Node_From_End_of_Linked_List {
    public int getKthFromLast(Node head, int k) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        if (k > cnt) return -1;
        Node t = head;
        for (int i = 1; i <= cnt - k; i++) {
            t = t.next;
        }
        return t.data;
    }
}