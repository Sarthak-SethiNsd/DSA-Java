import java.util.*;

public class Starters247_Conveyer_Belt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int p = sc.nextInt();
            String s = sc.next();
            int left = 0;
            int right = 0;
            for(int i = 0; i < p; i++)
            {
                if(s.charAt(i) == 'R')
                    left++;
            }
            for(int i = p - 1; i < n; i++)
            {
                if(s.charAt(i) == 'L')
                    right++;
            }
            System.out.println(Math.min(left, right));
            sc.close();
        }
    }
}
