import java.util.*;

public class L77_Combinations {
    // Using Recursion and Backtracking
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        recursion(1, n, k);
        return ans;
    }

    public void recursion(int start, int n, int k) {
        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i <= n - (k - curr.size()) + 1; i++) {
            curr.add(i);
            recursion(i + 1, n, k);
            curr.remove(curr.size() - 1);
        }
    }
}
