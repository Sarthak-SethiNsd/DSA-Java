import java.util.*;
public class round_1114_div3_problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int cnt = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    cnt++;
                }
            }
            int ans = cnt;
            for (int idx = 1; idx < n - 1; idx++) {
                int current = cnt;
                char l = s.charAt(idx - 1);
                char m = s.charAt(idx);
                char r = s.charAt(idx + 1);
                if (l == m && m == r) {
                } else if (l != m && m != r) {
                    if (l == r) {
                        current -= 2;
                    } else {
                        current -= 1;
                    }
                }
                ans = Math.min(ans, current);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}