import java.util.*;

public class Starters256_Fixed_Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            if(n - 1 == k) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}