package sixth.model;

import sixth.model.stack.DynamicStack;
import sixth.model.stack.Stack;

public class PalindromeIndicator {

    public static boolean indicatePalindrome(String checked) {
        Stack<Character> letterStorage = new DynamicStack();
        for (char letter : checked.toCharArray()) {
            try {
                letterStorage.push(letter);
            } catch (ContainerIsFullException e) {
                e.printStackTrace();
            }
        }

        StringBuilder reversed = new StringBuilder();
        while (!letterStorage.isEmpty()) {
            try {
                reversed.append(letterStorage.pop());
            } catch (ContainerIsEmptyException e) {
                e.printStackTrace();
            }
        }
        return checked.equals(reversed.toString());
    }

}
