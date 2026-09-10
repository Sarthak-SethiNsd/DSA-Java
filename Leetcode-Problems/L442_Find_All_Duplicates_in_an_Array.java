import java.util.*;

public class L442_Find_All_Duplicates_in_an_Array {
    // Using Cyclic Sort
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                int correct = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}