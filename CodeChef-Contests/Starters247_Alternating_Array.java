import java.util.*;

public class Starters247_Alternating_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int cnt1 = 0;
            int cnt2 = 0;
            for(int i = 0; i < n; i++)
            {
                if(i % 2 == 0)
                {
                    if(arr[i] % 2 == 0)
                        cnt1++;
                }
                else
                {
                    if(arr[i] % 2 != 0)
                        cnt1++;
                }
            }
            for(int i = 0; i < n; i++)
            {
                if(i % 2 == 0)
                {
                    if(arr[i] % 2 != 0)
                        cnt2++;
                }
                else
                {
                    if(arr[i] % 2 == 0)
                        cnt2++;
                }
            }
            System.out.println(Math.min(cnt1, cnt2));
            sc.close();
        }
    }
}
