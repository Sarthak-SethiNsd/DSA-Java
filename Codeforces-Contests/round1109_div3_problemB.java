import java.util.*;
public class round1109_div3_problemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            boolean ans = true;
            long prev = 0;
            for (int i = 0; i < n; i++) {
                long req = prev + 1;
                if (arr[i] < req) {
                    ans = false;
                    break;
                }
                long extra = arr[i] - req;
                arr[i] = req;
                if (i != n - 1) {
                    arr[i + 1] += extra;
                }
                prev = req;
            }
            System.out.println(ans ? "YES" : "NO");
        }
        sc.close();
    }
}
