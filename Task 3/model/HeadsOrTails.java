package third.model;

import java.util.Random;

public class HeadsOrTails {
    private static Random coinThrower = new Random();

    public static int howManyHeads(int tosses) {
        tosses = tosses > 0 ? tosses : -tosses;
        int heads = 0;

        for (int toss = 0; toss < tosses; toss++) {
            if (coinThrower.nextBoolean()) {
                heads++;
            }
        }

        return heads;
    }

}
