import java.util.*;

public class L17_Letter_Combinations_of_a_Phone_Number {
    // Using Recursion and Backtracking
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        solve(digits, 0, new StringBuilder(), ans, map);
        return ans;
    }

    void solve(String digits, int index, StringBuilder current,
               List<String> ans, Map<Character, String> map) {
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            solve(digits, index + 1, current, ans, map);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
