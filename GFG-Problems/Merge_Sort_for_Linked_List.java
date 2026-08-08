class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}
public class Merge_Sort_for_Linked_List {
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node h2 = slow.next;
        slow.next = null;

        head = mergeSort(head);
        h2 = mergeSort(h2);

        return Merge(head, h2);
    }
    public Node Merge(Node head1, Node head2) {
        Node d = new Node(1);
        Node i = head1;
        Node j = head2;
        Node k = d;
        while (i != null && j != null) {
            if (i.data >= j.data) {
                k.next = j;
                j = j.next;
            } else {
                k.next = i;
                i = i.next;
            }
            k = k.next;
        }
        if (i == null) k.next = j;
        else k.next = i;
        return d.next;
    }
}