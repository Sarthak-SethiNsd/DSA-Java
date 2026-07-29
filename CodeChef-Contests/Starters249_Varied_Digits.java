import java.util.*;

class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((x % 11 == 0) ? "No" : "Yes");
        sc.close();
    }
}