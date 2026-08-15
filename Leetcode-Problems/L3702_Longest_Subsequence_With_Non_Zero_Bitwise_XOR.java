public class L3702_Longest_Subsequence_With_Non_Zero_Bitwise_XOR {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean nonZero = false;
        for (int num : nums) {
            xor ^= num;
            if (num != 0) {
                nonZero = true;
            }
        }
        if (xor != 0) return nums.length;
        if (nonZero) return nums.length - 1;
        return 0;
    }
}