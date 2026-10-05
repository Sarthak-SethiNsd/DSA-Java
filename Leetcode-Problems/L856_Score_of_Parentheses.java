import java.util.*;

public class L856_Score_of_Parentheses {
    // Using Stack
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(0);
            } else {
                int x = st.pop();
                int y = st.pop();
                st.push(y + Math.max(2 * x, 1));
            }
        }
        return st.pop();
    }
}
