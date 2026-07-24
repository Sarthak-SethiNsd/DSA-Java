import java.util.*;
public class A106_Card_Game {
    static String order = "6789TJQKA";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char trump = sc.next().charAt(0);
        String card1 = sc.next();
        String card2 = sc.next();
        char r1 = card1.charAt(0);
        char s1 = card1.charAt(1);
        char r2 = card2.charAt(0);
        char s2 = card2.charAt(1);
        boolean beats = false;
        if (s1 == trump && s2 != trump) {
            beats = true;
        } else if (s1 == s2) {
            if (order.indexOf(r1) > order.indexOf(r2)) {
                beats = true;
            }
        }
        System.out.println(beats ? "YES" : "NO");
        sc.close();
    }
}