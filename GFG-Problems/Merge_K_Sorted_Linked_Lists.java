import java.util.*;
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Merge_K_Sorted_Linked_Lists {
    // Merge the lists pairwise using the sorted merge approach
    Node mergeKLists(Node[] arr) {
        ArrayList<Node> list = new ArrayList<>();
        for (Node head : arr) {
            list.add(head);
        }
        while (list.size() != 1) {
            Node t1 = list.remove(list.size() - 1);
            Node t2 = list.remove(list.size() - 1);
            list.add(sortedMerge(t1, t2));
        }
        return list.get(0);
    }
    Node sortedMerge(Node head1, Node head2) {
        Node d = new Node(-1);
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
        if (j == null) k.next = i;
        return d.next;
    }
}