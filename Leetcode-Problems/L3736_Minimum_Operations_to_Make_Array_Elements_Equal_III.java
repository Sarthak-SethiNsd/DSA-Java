public class L3736_Minimum_Operations_to_Make_Array_Elements_Equal_III {
    // Using Maximum Element and Differences
    public int minMoves(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int moves = 0;
        for (int num : nums) {
            moves += max - num;
        }
        return moves;
    }
}
