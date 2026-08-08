class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class Merge_Two_Sorted_Linked_Lists {
    Node sortedMerge(Node head1, Node head2) {
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