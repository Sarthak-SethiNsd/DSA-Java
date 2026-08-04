import java.util.*;
public class round_1114_div3_problem_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            int cnt=0;
            while(a!=b && b!=c && c!=a){
                if(a>b && a>c){
                    if(b>c) c++;
                    else b++;
                    a--;
                }
                else if(b>a && b>c){
                    if(a>c) c++;
                    else a++;
                    b--;
                }
                else{
                    if(a>b) b++;
                    else a++;
                    c--;
                }
                cnt++;
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
