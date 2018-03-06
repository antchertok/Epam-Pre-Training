package by.epam.pretraining.chertok.tasks.task9.model.textConverters;

import java.util.ArrayList;
import java.util.Arrays;

public enum TextSeparator {
    TEXT_SEPARATOR;

    public ArrayList<String> splitToWords(String text) {
        return new ArrayList<>(Arrays.asList(text.split("\\s")));
    }
}
