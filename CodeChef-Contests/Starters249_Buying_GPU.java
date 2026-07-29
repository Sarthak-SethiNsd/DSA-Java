import java.util.*;

class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (y >= z) {
                System.out.println(-1);
            } else {
                int cnt = 0;
                int ans = 0;
                while (ans < x) {
                    cnt++;
                    ans += z;
                    x += y;
                }
                System.out.println(cnt);
            }
        }
        sc.close();
    }
}