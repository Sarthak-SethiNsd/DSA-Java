import java.util.*;

public class Starters255_Unequal_Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            int na = 0;
            for(int i = 0; i < n; i++) {
                if(A.charAt(i) == 'a') na++;
                if(B.charAt(i) == 'a') na++;
            }
            System.out.println(na == n ? "YES" : "NO");
        }
        sc.close();
    }
}