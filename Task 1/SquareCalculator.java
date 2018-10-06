package first;

public class SquareCalculator {
    public static double getRingSquare(double firstRadius, double secondRadius) {
        return Math.abs(getCircleSquare(firstRadius) - getCircleSquare(secondRadius));
    }

    public static double getCircleSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
