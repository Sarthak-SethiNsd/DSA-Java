import java.util.*;

public class Starters247_Substring_Shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			char[] s = sc.next().toCharArray();
			int i = 0;
			while (i < N && s[i] != 'z') i++;
			while (i < N && s[i] == 'z') {
				s[i] = 'a';
				i++;
			}
			System.out.println(new String(s));
		}
		sc.close();
    }
}
