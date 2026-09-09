public class L3871_Count_Commas_in_Range_II {
    public long countCommas(long n) {
        if (n < 1000) return 0;
        else if (n < 1000000) return n - 999;
        else if (n < 1000000000) return n - 999 + n - 999999;
        else if (n < 1000000000000L) return n - 999 + n - 999999 + n - 999999999;
        else if (n == 1000000000000000L) return n - 999 + n - 999999 + n - 999999999 + n - 999999999999L + 1;
        else return n - 999 + n - 999999 + n - 999999999 + n - 999999999999L;
    }
}