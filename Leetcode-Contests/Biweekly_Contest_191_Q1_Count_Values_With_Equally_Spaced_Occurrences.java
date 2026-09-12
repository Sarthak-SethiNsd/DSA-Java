import java.util.*;
public class Biweekly_Contest_191_Q1_Count_Values_With_Equally_Spaced_Occurrences {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(int key:map.keySet()){
            if(map.get(key)==3){
                int first=-1;
                int second=-1;
                int third=-1;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==key){
                        if(first==-1) first=i;
                        else if(second==-1) second=i;
                        else third=i;
                    }
                }
                if(second-first==third-second) ans++;
            }
        }
        return ans;
    }
}