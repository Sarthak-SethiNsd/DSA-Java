class L3904_First_Stable_Index {
    // Using Prefix Maximum and Suffix Minimum
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] min = new int[n];
        min[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            min[i] = Math.min(nums[i], min[i + 1]);
        }
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
            if (maxi - min[i] <= k) return i;
        }
        return -1;
    }
}