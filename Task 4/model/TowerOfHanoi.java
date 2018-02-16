package by.epam.pretraining.forth.model;

public class TowerOfHanoi {

    public static String solve(int height, char src, char destination, char temp) {
        if (height == 0) {
            return "";
        }
        
        height = height < 0 ? -height : height;
        return solvePuzzle(height, src, destination, temp).toString();
    }

    public static StringBuilder solvePuzzle(int height, char src, char destination, char temp) {
        StringBuilder step = new StringBuilder();

        if (height > 1) {
            step.append(solvePuzzle(height - 1, src, temp, destination));
        }

        step.append(src + " --> " + destination + "\n");

        if (height > 1) {
            step.append(solvePuzzle(height - 1, temp, destination, src));
        }

        return step;
    }

}
