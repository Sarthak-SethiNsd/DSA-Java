import java.util.*;
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class Palindrome_Linked_List_ArrayList_Approach {
    public boolean isPalindrome(Node head) {
        int cnt = 0;
        Node temp = head;
        Node temp1 = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        if (cnt == 1) return true;
        ArrayList<Integer> ans = new ArrayList<>(cnt);
        for (int i = 0; i < cnt; i++) {
            ans.add(temp1.data);
            temp1 = temp1.next;
        }
        int i = 0;
        int j = cnt - 1;
        while (i < j) {
            if (!ans.get(i).equals(ans.get(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}