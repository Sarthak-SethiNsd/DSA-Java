import java.util.*;
public class Starters254_Three_Player_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(n%2==0) System.out.println(n+n/2+1);
            else System.out.println(n+(n-1)/2);
        }
        sc.close();
    }
}
