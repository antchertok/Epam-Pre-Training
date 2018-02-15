package by.epam.pretraining.forth.model;

public class Exponentiator {

    //    Если нужно было через одну функцию
    public static double powRecursive(int base, int exp) throws BaseEqualsZeroException {
        if (base == 0) {
            throw new BaseEqualsZeroException();
        }

        double involute;

        if (exp > 0) {
            involute = base * powRecursive(base, exp - 1);
        } else if (exp < 0) {
            involute = 1.0 / (base * powRecursive(base, -exp - 1));
        } else {
            involute = 1;
        }

        return involute;
    }

    //    Сюда подставляем рекурсивный или итерационный вариант
    public static double pow(int base, int exp) throws BaseEqualsZeroException {
        if (base == 0) {
            throw new BaseEqualsZeroException();
        }

        double involute;

        if (exp >= 0) {
            involute = powIterative(base, exp);
        } else {
            involute = 1.0 / powIterative(base, -exp);
        }
        return involute;
    }

    private static int powIterative(int base, int exp) {
        int involute = 1;

        for (; exp > 0; exp--) {
            involute *= base;
        }

        return involute;
    }

    private static int exponentRecursion(int base, int exp) {
        return exp == 0 ? 1 : base * exponentRecursion(base, exp - 1);
    }


}
