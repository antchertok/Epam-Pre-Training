package by.epam.pretraining.forth.model;

public class TowerOfHanoi {

    public static String solvePuzzle(int height, char src, char destination, char temp) {

        StringBuilder step = new StringBuilder();
        if (height > 1) {
            step.append(solvePuzzle(height - 1, src, temp, destination));
        }

        step.append(src + " --> " + destination + "\n");

        if (height > 1) {
            step.append(solvePuzzle(height - 1, temp, destination, src));
        }

        return step.toString();
    }

//    Итерационную версию придумать не успел. Простите :(
}
