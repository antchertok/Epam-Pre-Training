package by.epam.pretraining.chertok.tasks.task6.model;

import by.epam.pretraining.chertok.tasks.task6.model.exceptions.ContainerIsEmptyException;
import by.epam.pretraining.chertok.tasks.task6.model.stack.ListStack;
import by.epam.pretraining.chertok.tasks.task6.model.stack.Stack;

public class PalindromeIndicator {

    public static boolean indicatePalindrome(String checked) {
        if (checked.length() < 3) {
            return false;
        }
        Stack<Character> letterStorage = new ListStack();
        for (char letter : checked.toCharArray()) {
            letterStorage.push(letter);
        }

        StringBuilder reversed = new StringBuilder();
        while (!letterStorage.isEmpty()) {
            try {
                reversed.append(letterStorage.pop());
            } catch (ContainerIsEmptyException e) {
//                Exception is impossible
                e.printStackTrace();
            }
        }

        return checked.equals(reversed.toString());
    }

}
