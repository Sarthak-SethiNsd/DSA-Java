import java.util.*;
public class L3718_Smallest_Missing_Multiple_of_K_Sorting_Approach {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (i + 1) * k;
        }
        int i = 0, j = 0;
        while (i < nums.length) {
            if (nums[i] == arr[j]) j++;
            i++;
        }
        if (j == 100) return 101 * k;
        else return arr[j];
    }
}