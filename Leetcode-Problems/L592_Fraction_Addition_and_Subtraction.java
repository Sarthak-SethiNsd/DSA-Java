public class L592_Fraction_Addition_and_Subtraction {
    // Using GCD and Fraction Simplification
    public String fractionAddition(String expression) {
        int num = 0;
        int den = 1;
        int i = 0;
        while (i < expression.length()) {
            int sign = 1;
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                if (expression.charAt(i) == '-') sign = -1;
                i++;
            }
            int n = 0;
            while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                n = n * 10 + (expression.charAt(i) - '0');
                i++;
            }
            i++;
            int d = 0;
            while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                d = d * 10 + (expression.charAt(i) - '0');
                i++;
            }
            n *= sign;
            num = num * d + n * den;
            den = den * d;
            int g = gcd(Math.abs(num), den);
            num /= g;
            den /= g;
        }
        return num + "/" + den;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
