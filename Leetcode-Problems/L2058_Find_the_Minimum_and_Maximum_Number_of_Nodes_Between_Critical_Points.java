class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class L2058_Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode pre = head;
        ListNode curr = head.next;
        int index = 1;
        int first = -1;
        int prev = -1;
        int min = Integer.MAX_VALUE;
        int max = -1;
        while (curr.next != null) {
            if ((curr.val > pre.val && curr.val > curr.next.val) || (curr.val < pre.val && curr.val < curr.next.val)) {
                if (first == -1) first = index;
                if (prev != -1) {
                    min = Math.min(min, index - prev);
                    max = index - first;
                }
                prev = index;
            }
            pre = curr;
            curr = curr.next;
            index++;
        }
        if (min == Integer.MAX_VALUE) return new int[]{-1, -1};
        return new int[]{min, max};
    }
}