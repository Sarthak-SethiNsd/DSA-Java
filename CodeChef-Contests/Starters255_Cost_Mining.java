import java.util.*;
public class Starters255_Cost_Mining {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int day = 1;
            while(true) {
                boolean found = false;
                for(int gcost = 1; gcost <= day; gcost++) {
                    int mcost = 0;
                    for(int i = 1; i <= gcost; i++) {
                        mcost += i * i;
                    }
                    mcost += (day - gcost) * gcost * gcost;
                    int profit = Y * mcost - gcost * X;
                    if(profit > 0) {
                        found = true;
                        break;
                    }
                }
                if(found) {
                    System.out.println(day);
                    break;
                }
                day++;
            }
        }
        sc.close();
    }
}