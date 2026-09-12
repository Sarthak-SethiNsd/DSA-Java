public class Biweekly_Contest_191_Q2_Count_Values_With_Equally_Spaced_Occurrences_II {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.computeIfAbsent(nums[i],k-> new ArrayList<>()).add(i);
        }
        int ans=0;
        for(int key:map.keySet()){
            ArrayList<Integer> list= map.get(key);
            if(list.size()<3) continue;
            int gap=list.get(1)-list.get(0);
            boolean a=true;
            for(int i=2;i<list.size();i++){
                if(list.get(i)-list.get(i-1)!=gap){
                    a=false;
                    break;
                }
            }
            if(a) ans++;
        }
        return ans;
    }
}