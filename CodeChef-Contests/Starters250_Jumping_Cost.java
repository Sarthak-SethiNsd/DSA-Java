import java.util.*;
class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            int ans = 0;
            for (int j = 1; j < n; j++) {
                ans = Math.max(ans, sum + arr[j] - j);
                if (arr[j] > 0) {
                    sum += arr[j];
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}