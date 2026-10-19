import java.util.*;

public class L2089_Find_Target_Indices_After_Sorting_Array {
    // Using Sorting and Binary Search for First and Last Occurrences
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int l1 = 0, l2 = 0, h1 = nums.length - 1, h2 = nums.length - 1;
        List<Integer> ans = new ArrayList<>();
        int f = -1;
        int s = -1;
        while (l1 <= h1) {
            int mid = l1 + (h1 - l1) / 2;
            if (nums[mid] == target) {
                f = mid;
                h1 = mid - 1;
            } else if (nums[mid] > target) {
                h1 = mid - 1;
            } else {
                l1 = mid + 1;
            }
        }
        while (l2 <= h2) {
            int mid = l2 + (h2 - l2) / 2;
            if (nums[mid] == target) {
                s = mid;
                l2 = mid + 1;
            } else if (nums[mid] > target) {
                h2 = mid - 1;
            } else {
                l2 = mid + 1;
            }
        }
        if (f == s && f != -1) {
            ans.add(f);
            return ans;
        } else if (f == s && f == -1) {
            return ans;
        }
        for (int i = f; i <= s; i++) {
            ans.add(i);
        }
        return ans;
    }
}
