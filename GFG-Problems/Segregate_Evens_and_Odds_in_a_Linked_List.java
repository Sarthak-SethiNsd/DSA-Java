class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Segregate_Evens_and_Odds_in_a_Linked_List {
    // Maintain separate even and odd lists, then connect the even list to the odd list
    Node divide(Node head) {
        if (head == null || head.next == null) return head;
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            } else {
                if (oddHead == null) {
                    oddHead = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            }
            temp = temp.next;
        }
        if (evenHead == null) return oddHead;
        if (oddHead == null) return evenHead;
        evenTail.next = oddHead;
        oddTail.next = null;
        return evenHead;
    }
}