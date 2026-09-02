import java.util.*;
class Starters254_Reach_Weight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans=(n/2)*30+(n%2)*20;
            System.out.println(ans);
        }
        sc.close();
    }
}