import java.util.*;
public class L3069_Distribute_Elements_Into_Two_Arrays_I {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (l1.get(l1.size() - 1) > l2.get(l2.size() - 1)) {
                l1.add(nums[i]);
            } else {
                l2.add(nums[i]);
            }
        }
        for (int i = 0; i < l1.size(); i++) {
            nums[i] = l1.get(i);
        }
        for (int j = 0; j < l2.size(); j++) {
            nums[l1.size() + j] = l2.get(j);
        }
        return nums;
    }
}