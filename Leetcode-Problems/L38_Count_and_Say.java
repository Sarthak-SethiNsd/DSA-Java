public class L38_Count_and_Say {
    // Using Iteration and StringBuilder
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int j = 0;
            while (j < s.length()) {
                int count = 1;
                while (j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
                    count++;
                    j++;
                }
                sb.append(count).append(s.charAt(j));
                j++;
            }
            s = sb.toString();
        }
        return s;
    }
}
