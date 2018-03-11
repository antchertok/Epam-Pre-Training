package by.epam.pretraining.chertok.tasks.task9.model.textWorkers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum WordFinder {
    WORD_FINDER;

    //#4
    public String findWordsInInterrogativeSentence(String text, int wordLength) {
        Pattern pattern = Pattern.compile("((\\s|^)[a-zA-Z0-9']+[,;]?)+\\?");
        Matcher interrogativeSentence = pattern.matcher(text);
        pattern = Pattern.compile("(\\s|^)\\w{" + wordLength + "}(\\s|[.?!,;])");

        StringBuilder words = new StringBuilder();
        while (interrogativeSentence.find()){
            Matcher wordWithGivenLength = pattern.matcher(interrogativeSentence.group());

            while (wordWithGivenLength.find()){
                if(!words.toString().contains(wordWithGivenLength.group())){
                    words.append(wordWithGivenLength.group().replaceAll("[.?!,;]", ""));
                }
            }
        }
        return words.toString();
    }
}
