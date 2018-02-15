package third.model;

public class PalindromeIndicator {

    public static boolean indicatePalindrome(int number) {
        number = number > 0 ? number : -number;
        int reversed = 0;
        int bunchOfDigits = number;

        while (bunchOfDigits > 0) {
            reversed = reversed * 10 + bunchOfDigits % 10;
            bunchOfDigits /= 10;
        }

        return number == reversed;
    }

}
