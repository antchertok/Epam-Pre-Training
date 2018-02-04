package first;

public class SequenceIndicator {
    public static boolean isIncreasingSequence(int n) {
        boolean isIncreasing = true;
        int digit = n % 10;
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
