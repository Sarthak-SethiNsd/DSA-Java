public class L3723_Max_Sum_of_Squares_of_Digits {
    // Using Greedy Approach
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        while (sum >= 9) {
            ans.append('9');
            sum -= 9;
        }
        if (sum > 0) {
            ans.append((char) ('0' + sum));
        }
        while (ans.length() < num) {
            ans.append('0');
        }
        return ans.toString();
    }
}
