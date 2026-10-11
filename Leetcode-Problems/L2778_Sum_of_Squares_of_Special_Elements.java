public class L2778_Sum_of_Squares_of_Special_Elements {
    // Using Divisibility Check
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                sum += nums[i] * nums[i];
            }
        }
        return sum;
    }
}
