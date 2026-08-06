public class L3345_Smallest_Divisible_Digit_Product_I {
    public int smallestNumber(int n, int t) {
        for (int i = n; i < 101; i++) {
            if (i < 10) {
                if (i % t == 0) {
                    return i;
                }
            } 
            else {
                int product = (i % 10) * (i / 10);
                if (product % t == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}