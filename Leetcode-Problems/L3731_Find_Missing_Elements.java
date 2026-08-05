import java.util.*;
public class L3731_Find_Missing_Elements {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int[] freq = new int[max - min + 1];
        for (int num : nums) {
            freq[num - min]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                ans.add(i + min);
            }
        }
        return ans;
    }
}