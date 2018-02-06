package third.model;

public class PalindromeIndicator {

    public static boolean isPalindrome(int number) {
        number = number > 0 ? number : -number;

        return number == reverse(number);
    }

    private static int reverse(int number){
        int reversed = 0;

        for (; number > 0; number /= 10) {
            reversed = reversed * 10 + number % 10;
        }
        return reversed;
    }
}
