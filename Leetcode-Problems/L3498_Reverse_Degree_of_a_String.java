public class L3498_Reverse_Degree_of_a_String {
    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = 'z' - s.charAt(i) + 1;
            ans += (i + 1) * value;
        }
        return ans;
    }
}