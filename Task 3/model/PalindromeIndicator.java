package third.model;

public class PalindromeIndicator {

    public static boolean isPalindrome(int number) {
        number = number > 0 ? number : -number;
        return number == reverse(number);
    }

    private static int reverse(int number){
        int reversed = 0;

        for (int n = number; n > 0; n /= 10) {
            reversed = reversed * 10 + n % 10;
        }
        return reversed;
    }
}
