package by.epam.pretraining.forth.model;

import second.model.DaySwitch;
import second.model.InvalidDateException;

public class ExponentiatorRunner {
    public static double run(int base, int exp) {
        double invalute = -1;

        try {
            invalute = Exponentiator.powRecursive(base, exp);
        } catch (BaseEqualsZeroException e) {
            e.printStackTrace();
        }

        return invalute;
    }
}





