public class L3622_Check_Divisibility_by_Digit_Sum_and_Product {
    public boolean checkDivisibility(int n) {
        int x = n;
        int dsum = 0;
        int dpro = 1;
        while (n > 0) {
            dsum += n % 10;
            dpro *= n % 10;
            n /= 10;
        }
        int ans = dsum + dpro;
        if (x % ans == 0) return true;
        return false;
    }
}