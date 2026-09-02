import java.util.*;
class CodeChef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int winsize=n-k;
            int winsum=0;
            for(int i=0;i<winsize;i++){
                winsum+=arr[i];
            }
            int max=winsum;
            for(int i=winsize;i<n;i++){
                winsum+=arr[i];
                winsum-=arr[i-winsize];
                max=Math.max(max,winsum);
            }
            System.out.println(max);
        }
        sc.close();
    }
}