package first;

public class NumberAnalyzer {

    public static int calcSum(int n) {
        int sum = n % 10;

        sum = sum + (n /= 10) % 10;
        sum = sum + (n /= 10) % 10;
        sum = sum + (n /= 10) % 10;
        sum += (n /= 10);

        return sum;
    }

    public static int calcMult(int n) {
        int mult = n % 10;

        mult *= (n /= 10) % 10;
        mult *= (n /= 10) % 10;
        mult *= (n /= 10) % 10;
        mult *= (n /= 10);

        return mult;
    }

}
