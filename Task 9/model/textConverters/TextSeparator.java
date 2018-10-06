package by.epam.pretraining.chertok.tasks.task9.model.textConverters;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public enum TextSeparator {
    TEXT_SEPARATOR;

    public List<String> splitToWords(String text) {
        return new ArrayList<String>(Arrays.asList(text.split("\\s")));
    }
}
