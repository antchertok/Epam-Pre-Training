package second;

public class First {

    static int getAmountOfHeads(int n) {
        int heads = 3;

        if (n >= 200) {
            heads += 600;
            n -= 200;

            if (n >= 100) {
                heads = heads + 200 + (n - 100);
            } else {
                heads += (n * 2);
            }
        } else {
            heads += (n * 3);
        }

        return heads;
    }

    static int getAmountOfEyes(int heads) {
        return heads * 2;
    }

}
