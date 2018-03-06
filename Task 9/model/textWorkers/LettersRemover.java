package by.epam.pretraining.chertok.tasks.task9.model.textWorkers;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum LettersRemover {
    LETTERS_REMOVER;

    //#15
    //Remove all entries of the first letter, besides the beginning
    public List<String> removeFirstLetters(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            if (word.length() > 1) {
                char deletedLetter = word.toLowerCase().charAt(0);

                if(Character.isAlphabetic(deletedLetter)) {
                    Pattern pattern = Pattern.compile("[a-zA-Z]" + deletedLetter);
                    Matcher matcher = pattern.matcher(word);

                    if (matcher.find()) {
                        StringBuilder changedWord = new StringBuilder();
                        changedWord.append(deletedLetter);

                        for(String str: word.split(String.valueOf(deletedLetter))){
                            changedWord.append(str);
                        }
                        words.set(i, changedWord.toString());
                    }
                }
            }
        }
        return words;
    }

    //Remove all entries of the first letter
    public List<String> removeAllFirstLetters(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > 1) {
                Pattern pattern = Pattern.compile("[" + words.get(i).toLowerCase().charAt(0) + "]");
                Matcher matcher = pattern.matcher(words.get(i).toLowerCase());
                words.set(i, matcher.replaceAll(""));
            }
        }
        return words;
    }
}


