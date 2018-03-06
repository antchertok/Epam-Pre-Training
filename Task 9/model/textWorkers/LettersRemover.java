package by.epam.pretraining.chertok.tasks.task9.model.textWorkers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum LettersRemover {
    LETTERS_REMOVER;

    //#15
    //Remove all entries of the first letter, besides the beginning
    public ArrayList<String> removeFirstLetters(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.length() > 0) {
                char deletedLetter = word.toLowerCase().charAt(0);
                Pattern pattern = Pattern.compile("\\w" + deletedLetter);
                Matcher matcher = pattern.matcher(word);

                if(matcher.find()){
                    word = matcher.replaceFirst(matcher.group().replace(deletedLetter, (char)0));
                    words.set(i, word);
                }
            }
        }
        return words;
    }

    //Remove all entries of the first letter
    public ArrayList<String> removeAllFirstLetters(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > 0) {
                Pattern pattern = Pattern.compile(((Character) words.get(i).toLowerCase().charAt(0)).toString());
                Matcher matcher = pattern.matcher(words.get(i).toLowerCase());
                words.set(i, matcher.replaceAll(""));
            }
        }
        return words;
    }
}


