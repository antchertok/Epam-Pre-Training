package by.epam.pretraining.forth.model;

public class ExponentiatorRunner {
    public static double run(int base, int exp) {
        double involute = -1;

        try {
            involute = Exponentiator.powRecursive(base, exp);
        } catch (BaseEqualsZeroException e) {
            e.printStackTrace();
        }

        return involute;
    }
}





