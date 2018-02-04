package third.model;

public class PalindromeIndicator {

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        number = number > 0 ? number : -number;

        for (int n = number; n > 0; n /= 10) {
            reversed = reversed * 10 + n % 10;
        }

        return number == reversed;
    }

}
