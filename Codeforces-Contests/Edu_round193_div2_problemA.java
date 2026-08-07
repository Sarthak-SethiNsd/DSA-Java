import java.util.*;
public class Edu_round193_div2_problemA {
    static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (isPrime(n + 1)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}