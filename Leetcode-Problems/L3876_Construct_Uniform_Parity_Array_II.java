class L3876_Construct_Uniform_Parity_Array_II {
    public boolean uniformArray(int[] nums1) {
        int minEven = Integer.MAX_VALUE;
        int minOdd = Integer.MAX_VALUE;
        boolean even = true;
        boolean odd = true;
        for (int num : nums1) {
            if (num % 2 == 0) {
                minEven = Math.min(minEven, num);
                odd = false;
            } else {
                minOdd = Math.min(minOdd, num);
                even = false;
            }
        }
        if (even || odd) return true;
        return (minEven - minOdd) >= 1;
    }
}