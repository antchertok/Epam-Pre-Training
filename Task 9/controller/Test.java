package by.epam.pretraining.chertok.tasks.task9.controller;

import by.epam.pretraining.chertok.tasks.task9.model.exceptions.FileNotOpenedException;
import by.epam.pretraining.chertok.tasks.task9.view.View;

import static by.epam.pretraining.chertok.tasks.task9.model.textWorkers.WordFinder.WORD_FINDER;
import static by.epam.pretraining.chertok.tasks.task9.model.textConverters.TextReader.TEXT_READER;
import static by.epam.pretraining.chertok.tasks.task9.model.textConverters.TextMaker.TEXT_MAKER;
import static by.epam.pretraining.chertok.tasks.task9.model.textWorkers.LettersRemover.LETTERS_REMOVER;
import static by.epam.pretraining.chertok.tasks.task9.model.textConverters.TextSeparator.TEXT_SEPARATOR;

public class Test {

    public static void main(String[] args) throws FileNotOpenedException {
        final String PATH = "C:\\Users\\-\\IdeaProjects\\StartProjects\\src\\by\\epam\\pretraining\\chertok\\tasks\\task9\\model\\files\\Text.txt";
//        View.print(TEXT_MAKER.makeString(TEXT_SEPARATOR.splitToWords(TEXT_READER.readText(PATH))));
//        View.print("------------------------------------");
//        View.print(TEXT_MAKER.makeString(LETTERS_REMOVER.removeFirstLetters(TEXT_SEPARATOR.splitToWords(TEXT_READER.readText(PATH)))));
//        View.print("------------------------------------");
        System.out.println(TEXT_READER.readText(PATH));
        View.print(WORD_FINDER.findWordsInInterrogativeSentence(TEXT_READER.readText(PATH), 4));
    }
}
