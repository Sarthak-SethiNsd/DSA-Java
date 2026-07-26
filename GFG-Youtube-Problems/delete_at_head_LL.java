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

    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
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

public class delete_at_head_LL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();
        list.deleteAtHead();
        list.display();
        list.deleteAtHead();
        list.display();
    }
}