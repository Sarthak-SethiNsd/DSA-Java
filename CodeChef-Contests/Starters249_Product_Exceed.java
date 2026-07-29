import java.util.*;

class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = sc.nextInt();
            int cnt = 0;
            while (x * y < p) {
                if (x >= y) {
                    y++;
                } else {
                    x++;
                }
                cnt++;
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}