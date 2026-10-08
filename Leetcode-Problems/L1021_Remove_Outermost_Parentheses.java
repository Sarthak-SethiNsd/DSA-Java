public class L1021_Remove_Outermost_Parentheses {
    // Using Depth Counter
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) ans.append(c);
                depth++;
            } else {
                depth--;
                if (depth > 0) ans.append(c);
            }
        }
        return ans.toString();
    }
}
