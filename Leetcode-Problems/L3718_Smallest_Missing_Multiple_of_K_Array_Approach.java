public class L3718_Smallest_Missing_Multiple_of_K_Array_Approach {
    public int missingMultiple(int[] nums, int k) {
        int[] arr = new int[100];
        for (int num : nums) {
            if (num % k == 0) {
                int index = num / k;
                if (index <= 100) {
                    arr[index - 1] = 1;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            if (arr[i] == 0) {
                return (i + 1) * k;
            }
        }
        return 101 * k;
    }
}