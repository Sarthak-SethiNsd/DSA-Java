import java.util.*;

public class A141_Amusing_Joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        char[] x = (a + b).toCharArray();
        char[] y = c.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if (Arrays.equals(x, y)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}