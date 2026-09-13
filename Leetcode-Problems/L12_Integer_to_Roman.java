public class L12_Integer_to_Roman {
    // Using If Conditions and StringBuilder
    public String intToRoman(int n) {
        StringBuilder ans = new StringBuilder();
        if (n >= 1000) {
            int m = n / 1000;
            n -= m * 1000;
            for (int i = 1; i <= m; i++) ans.append('M');
        }
        if (n >= 900) {
            n -= 900;
            ans.append("CM");
        }
        if (n >= 500) {
            n -= 500;
            ans.append('D');
        }
        if (n >= 400) {
            n -= 400;
            ans.append("CD");
        }
        if (n >= 100) {
            int c = n / 100;
            n -= c * 100;
            for (int i = 1; i <= c; i++) ans.append('C');
        }
        if (n >= 90) {
            n -= 90;
            ans.append("XC");
        }
        if (n >= 50) {
            n -= 50;
            ans.append('L');
        }
        if (n >= 40) {
            n -= 40;
            ans.append("XL");
        }
        if (n >= 10) {
            int x = n / 10;
            n -= x * 10;
            for (int i = 1; i <= x; i++) ans.append('X');
        }
        if (n == 9) {
            ans.append("IX");
            return ans.toString();
        }
        if (n >= 5) {
            n -= 5;
            ans.append('V');
        }
        if (n == 4) {
            ans.append("IV");
            return ans.toString();
        }
        for (int i = 1; i <= n; i++) ans.append('I');
        return ans.toString();
    }
}