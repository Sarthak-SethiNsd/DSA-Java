import java.util.*;

public class L47_Permutations_II {
    // Using Sorting and Backtracking with Duplicate Skipping
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], ans);
        return ans;
    }
    private void backtrack(int[] nums, List<Integer> curr, boolean[] used, List<List<Integer>> ans) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            curr.add(nums[i]);
            backtrack(nums, curr, used, ans);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}
