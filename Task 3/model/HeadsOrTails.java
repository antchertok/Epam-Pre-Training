package third.model;

import java.util.Random;

public class HeadsOrTails {
    private static Random random = new Random();

    private enum HeadOrTail {HEAD, TAIL}

    ;

    public static String emulateHeadsOrTails(int amountOfFlings) {
        int heads = 0;
        int tails = 0;
        for (int fling = 0; fling < amountOfFlings; fling++) {
            switch (throwCoin()) {
                case HEAD:
                    heads++;
                    break;
                case TAIL:
                    tails++;
                    break;
            }
        }
        return "Heads: " + heads + " Tails: " + tails;
    }

    private static HeadOrTail throwCoin() {
        if (random.nextInt(2) == 0) {
            return HeadOrTail.HEAD;
        } else {
            return HeadOrTail.TAIL;
        }
    }

    //    Или так
    public static int howManyHeads(int amountOfFlings) {
        int heads = 0;

        for (int fling = 0; fling < amountOfFlings; fling++) {
            if (throwCoin() == HeadOrTail.HEAD) {
                heads++;
            }
        }

        return heads;
    }

}
