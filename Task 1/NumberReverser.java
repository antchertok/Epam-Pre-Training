package first;

public class NumberReverser {

    public static int reverse(int n) {
        int reversed = n % 10;

        reversed = reversed * 10 + (n /= 10) % 10;
        reversed = reversed * 10 + (n /= 10) % 10;
        reversed = reversed * 10 + (n /= 10) % 10;
        reversed = reversed * 10 + (n /= 10) % 10;
        reversed = reversed * 10 + (n /= 10) % 10;
        reversed = reversed * 10 + (n /= 10);

        return reversed;
    }

}
