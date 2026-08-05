import java.util.*;
class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans = 0;
            if (n <= 3) {
                ans = n * x;
            } else {
                ans = 3 * x + (n - 3) * y;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}