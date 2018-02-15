package by.epam.pretraining.forth.controller;

import by.epam.pretraining.forth.model.*;
import by.epam.pretraining.forth.view.View;

public class Test {

    public static void main(String[] args) {
        View.print(DigitsCalc.runCalcSumOfDigits(100230));
        View.print(DigitsCalc.calcSumOfDigitsIterative(100230));
        View.print("");

        
        View.print(ExponentiatorRunner.run(2, -3));
        View.print("");

        View.print(EqualityIndicator.checkEquality(10005, 6));
        View.print(EqualityIndicator.findEqualityIterative(10005, 6));
        View.print("");

        View.print(FibonacciNumberDetector.calcFibNumber(9));
        View.print(FibonacciNumberDetector.calcFibNumberIterative(9));
        View.print("");

        View.print(TowerOfHanoi.solvePuzzle(2, 'A', 'B', 'C'));
        View.print("");
        View.print(TowerOfHanoi.solvePuzzle(2, 'A', 'B', 'C'));

    }
}
