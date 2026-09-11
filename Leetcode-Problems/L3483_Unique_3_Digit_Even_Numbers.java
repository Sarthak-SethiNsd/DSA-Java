public class L3483_Unique_3_Digit_Even_Numbers {
    // Using Frequency Array
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }
        int ans = 0;
        for (int num = 100; num <= 999; num++) {
            if (num % 2 != 0) {
                continue;
            }
            int[] need = new int[10];
            int x = num;
            while (x > 0) {
                need[x % 10]++;
                x /= 10;
            }
            boolean possible = true;
            for (int i = 0; i <= 9; i++) {
                if (need[i] > freq[i]) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                ans++;
            }
        }
        return ans;
    }
}