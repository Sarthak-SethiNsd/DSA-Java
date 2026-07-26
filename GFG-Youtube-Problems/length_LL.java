class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class LL {
    Node head;
    Node tail;
    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }

    int length() {
        if (head == null) return 0;
        Node temp = head;
        int idx = 0;
        while (temp!= null) {
            temp = temp.next;
            idx++;
        }
        return idx;
    }

    void display() {
        if (head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class length_LL {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);

        System.out.println(ll.length());
    }
}