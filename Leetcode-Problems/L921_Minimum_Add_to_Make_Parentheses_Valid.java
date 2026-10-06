public class L921_Minimum_Add_to_Make_Parentheses_Valid {
    // Using Counter
    public int minAddToMakeValid(String s) {
        int open = 0;
        int ans = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } 
            else {
                if (open > 0) {
                    open--;
                } else {
                    ans++;
                }
            }
        }
        return ans + open;
    }
}
