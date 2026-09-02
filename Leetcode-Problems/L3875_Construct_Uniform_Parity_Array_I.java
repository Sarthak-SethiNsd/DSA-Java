public class L3875_Construct_Uniform_Parity_Array_I {
    public boolean uniformArray(int[] nums1) {
        // If all elements have the same parity, keep them as they are.
        // If both odd and even exist, subtract an opposite-parity element to make the result odd.
        // Therefore, a uniform parity array can always be constructed.
        return true;
    }
}