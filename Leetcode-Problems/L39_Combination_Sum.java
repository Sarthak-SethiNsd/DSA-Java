import java.util.*;

public class L39_Combination_Sum {
    // Using Recursion and Backtracking with Take-or-Skip Approach
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, 0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
    private void solve(int i, int sum, int[] candidates, int target, List<Integer> curr, List<List<Integer>> ans) {
        if (sum == target) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if (i == candidates.length || sum > target) {
            return;
        }
        curr.add(candidates[i]);
        solve(i, sum + candidates[i], candidates, target, curr, ans);
        curr.remove(curr.size() - 1);
        solve(i + 1, sum, candidates, target, curr, ans);
    }
}
