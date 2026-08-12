import java.util.*;
public class L2958_Length_of_Longest_Subarray_With_at_Most_K_Frequency {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int invalid = 0;
        int left = 0;
        int ans = 0;
        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == k + 1) {
                invalid++;
            }
            while (invalid > 0) {
                int x = nums[left];
                if (map.get(x) == k + 1) {
                    invalid--;
                }
                map.put(x, map.get(x) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}