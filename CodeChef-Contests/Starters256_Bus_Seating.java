import java.util.*;
public class Starters256_Bus_Seating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            if(k <= n) System.out.println(0);
            else System.out.println(2 * (k - n));
        }
        sc.close();
    }
}