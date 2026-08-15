class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Palindrome_Linked_List_Reverse_Second_Half {
    // Find the middle, reverse the second half, and compare both halves
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        Node pre = null;
        Node forw = null;
        Node curr = slow;
        while (curr != null) {
            forw = curr.next;
            curr.next = pre;
            pre = curr;
            curr = forw;
        }
        Node i = head;
        Node j = pre;
        while (j != null) {
            if (i.data != j.data) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
}