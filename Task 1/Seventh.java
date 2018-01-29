public class Seventh {
    static int reverse(int n) {
        int reversed = 0;
        reversed = reversed * 10 + n % 10;
        n /= 10;
        reversed = reversed * 10 + n % 10;
        n /= 10;
        reversed = reversed * 10 + n % 10;
        n /= 10;
        reversed = reversed * 10 + n % 10;
        n /= 10;
        reversed = reversed * 10 + n % 10;
        n /= 10;
        reversed = reversed * 10 + n % 10;
        n /= 10;
        reversed = reversed * 10 + n;
        return reversed;
    }
}
