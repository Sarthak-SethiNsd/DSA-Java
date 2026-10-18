import java.util.*;

public class L40_Combination_Sum_II {
    // Using Sorting and Backtracking with Duplicate Skipping
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
    private void solve(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;
            current.add(candidates[i]);
            solve(i + 1, candidates, target - candidates[i], current, ans);
            current.remove(current.size() - 1);
        }
    }
}
