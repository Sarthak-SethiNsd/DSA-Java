import java.util.*;
class Starters254_Good_Subset_Easy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] count=new int[31];
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                int bit=31-Integer.numberOfLeadingZeros(x);
                count[bit]++;
            }
            int ans=0;
            for(int i=0;i<31;i++){
                ans=Math.max(ans,count[i]);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}