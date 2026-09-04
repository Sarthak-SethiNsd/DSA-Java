class L3903_First_Stable_Index {
    public int min(int[] arr, int start, int end) {
        int mini = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            mini = Math.min(mini, arr[i]);
        }
        return mini;
    }
    public int firstStableIndex(int[] arr, int k) {
        int n = arr.length;
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
            int b = min(arr, i, n - 1);
            if (maxi - b <= k) return i;
        }
        return -1;
    }
}