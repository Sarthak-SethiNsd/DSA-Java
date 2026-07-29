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
            boolean ans = true;
            int l = Integer.MIN_VALUE;
            int r = Integer.MAX_VALUE;
            int i = 0, j = n - 1;
            while (i < j) {
                int a = arr[i];
                int b = arr[j];
                if (Math.abs(a - b) != 0 && Math.abs(a - b) != 2) {
                    ans = false;
                    break;
                }
                if (a < b) {
                    l = Math.max(l, a);
                    r = Math.min(r, b);
                } else if (a > b) {
                    l = Math.max(l, b);
                    r = Math.min(r, a);
                }
                i++;
                j--;
            }
            if (ans && l >= r) {
                ans = false;
            }
            System.out.println(ans ? "Yes" : "No");
        }
        sc.close();
    }
}