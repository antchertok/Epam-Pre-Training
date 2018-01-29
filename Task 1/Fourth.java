public class Fourth {
    static boolean isIncreasingSequence(int n) {
        int digit;
        boolean isIncreasing = true;
        digit = n % 10;
        n /= 10;
        isIncreasing = (digit <= (n % 10) || !isIncreasing) ? false : true;

        digit = n % 10;
        n /= 10;
        isIncreasing = (digit <= (n % 10) || !isIncreasing) ? false : true;

        digit = n % 10;
        n /= 10;
        isIncreasing = (digit <= (n % 10) || !isIncreasing) ? false : true;
        return isIncreasing;
    }
}
