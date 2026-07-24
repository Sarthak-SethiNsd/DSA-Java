import java.util.*;
public class A228_Is_Your_Horseshoe_On_The_Other_Hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}