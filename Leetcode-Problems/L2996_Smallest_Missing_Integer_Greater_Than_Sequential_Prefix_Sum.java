import java.util.*;
public class L2996_Smallest_Missing_Integer_Greater_Than_Sequential_Prefix_Sum {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < sum) continue;
            if (nums[i] == sum) {
                sum++;
            } 
            else {
                return sum;
            }
            while (i + 1 < nums.length && nums[i + 1] == nums[i]) {
                i++;
            }
        }
        return sum;
    }
}