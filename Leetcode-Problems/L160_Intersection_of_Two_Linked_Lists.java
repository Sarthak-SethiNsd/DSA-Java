class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class L160_Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;
        ListNode t3 = headA;
        ListNode t4 = headB;
        int cntA = 0;
        int cntB = 0;
        while (t1 != null) {
            cntA++;
            t1 = t1.next;
        }
        while (t2 != null) {
            cntB++;
            t2 = t2.next;
        }
        if (cntA >= cntB) {
            for (int i = 1; i <= cntA - cntB; i++) {
                t3 = t3.next;
            }
        } 
        else {
            for (int i = 1; i <= cntB - cntA; i++) {
                t4 = t4.next;
            }
        }
        while (t3 != t4) {
            t3 = t3.next;
            t4 = t4.next;
        }
        return t3;
    }
}