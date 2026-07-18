public class Biweekly_Contest_187_Q2 {
    public long maximumValue(int n, int s, int m) {
        if (n == 1) return s;
        return (long) s + (long) (n / 2) * m - (long) ((n - 2) / 2);
    }
}