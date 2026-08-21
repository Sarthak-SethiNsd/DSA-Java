class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Reverse_a_Sublist_in_a_Linked_List {
    Node reverseBetween(int a, int b, Node head) {
        if (head.next == null || a == b) return head;
        Node pre = head;
        Node ata = head;
        Node atb = head;
        Node forw = head;
        if (a == 1) {
            ata = head;
        } else {
            for (int i = 1; i < a - 1; i++) {
                pre = pre.next;
                ata = ata.next;
            }
            ata = ata.next;
        }
        for (int i = 1; i < b; i++) {
            forw = forw.next;
            atb = atb.next;
        }
        forw = forw.next;
        Node oldAta = ata;
        Node newHead = reverse(ata, atb);
        oldAta.next = forw;
        if (a == 1) {
            head = newHead;
        } else {
            pre.next = newHead;
        }
        return head;
    }
    Node reverse(Node a, Node b) {
        Node prev = null;
        Node curr = a;
        Node stop = b.next;
        while (curr != stop) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}