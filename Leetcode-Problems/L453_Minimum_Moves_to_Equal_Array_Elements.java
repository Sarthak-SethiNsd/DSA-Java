public class L453_Minimum_Moves_to_Equal_Array_Elements {
    // Using Minimum Element and Sum
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }
        return sum - nums.length * min;
    }
}
