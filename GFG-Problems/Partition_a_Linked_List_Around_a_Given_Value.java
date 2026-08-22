class Node {
    public int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Partition_a_Linked_List_Around_a_Given_Value {
    public Node partition(Node head, int x) {
        Node d1 = new Node(-1);
        Node t1 = d1;
        Node d2 = new Node(-1);
        Node t2 = d2;
        Node d3 = new Node(-1);
        Node t3 = d3;
        Node temp = head;
        while (temp != null) {
            if (temp.data < x) {
                t1.next = temp;
                t1 = temp;
            } else if (temp.data == x) {
                t2.next = temp;
                t2 = temp;
            } else {
                t3.next = temp;
                t3 = temp;
            }
            temp = temp.next;
        }
        t3.next = null;
        if (d2.next != null) {
            t1.next = d2.next;
            t2.next = d3.next;
        } else {
            t1.next = d3.next;
        }
        if (d1.next != null) return d1.next;
        if (d2.next != null) return d2.next;
        return d3.next;
    }
}