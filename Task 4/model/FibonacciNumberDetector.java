package by.epam.pretraining.forth.model;

public class FibonacciNumberDetector {

    public static int calcFibNumber(int order) {
        int fibNumber;

        if (order >= 3) {
            fibNumber = calcFibNumber(order - 1) + calcFibNumber(order - 2);
        } else if (order > 0) {
            fibNumber = order == 1 ? 0 : 1;;
        } else {
            fibNumber = -1;
        }

        return fibNumber;
    }

    public static int calcFibNumberIterative(int order) {
        if(order < 2){
            return order <= 0 ? -1: 0;
        }

        int last = 0;
        int fibNumber = 1;

        for (; order > 2; order--) {
            fibNumber = last + (last = fibNumber);
        }

        return fibNumber;
    }
}
