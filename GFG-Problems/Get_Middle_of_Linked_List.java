class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Get_Middle_of_Linked_List {
    int getMiddle(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        Node t = head;
        for (int i = 1; i < (cnt / 2) + 1; i++) {
            t = t.next;
        }
        return t.data;
    }
}