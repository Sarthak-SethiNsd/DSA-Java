import java.util.*;

public class Starters255_Additive_Dissonance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < N; i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            int ans = 1;
            for(int freq : map.values()) {
                ans = Math.max(ans, (freq + 1) / 2);
            }
            System.out.println(ans);
        }
    }
}