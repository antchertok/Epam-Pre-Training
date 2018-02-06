package third.controller;

import third.view.View;
import third.model.*;

public class Test {
    public static void main(String[] args) {
        int tosses = -1000;
        int number = -12321;
        int perfTest = 28;


        View.print(HeadsOrTails.howManyHeads(tosses) + " heads");

        View.print("The largest digit in " + number + ": "
                + MaxDigitDetector.getMaxDigit(number));

        View.print(number + " is a palindrome: "
                + PalindromeIndicator.isPalindrome(number));

        View.print(number + " is prime: "
                + PrimeNumberManager.isPrime(number));

        View.print("Prime divisors of " + number + ": "
                + PrimeNumberManager.getPrimeDivisors(number));

        View.print("The greatest common divisor of " + tosses + " and " + perfTest
                + ": " + CommonPropCalc.calcGCD(tosses, perfTest));

        View.print("The least common multiple of " + tosses + " and " + perfTest
                + ": " + CommonPropCalc.calcLCM(tosses, perfTest));

        View.print(number + " contains "
                + DigitCounter.howManyDigits(number) + " digits");

        View.print(perfTest + " is perfect: "
                + PerfectNumberIndicator.isPerfect(perfTest));

    }

}
