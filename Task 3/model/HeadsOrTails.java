package third.model;

import java.util.Random;

public class HeadsOrTails {
    private static Random coinThrower = new Random();

    public static int howManyHeads(int amountOfTosses) {
        int heads = 0;

        for (int toss = 0; toss < amountOfTosses; toss++) {
            if (coinThrower.nextBoolean()) {
                heads++;
            }
        }

        return heads;
    }

}
