package by.epam.pretraining.chertok.tasks.task9.model.textConverters;

import java.util.List;

public enum TextMaker {
    TEXT_MAKER;

    public String makeString(List<String> words) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            if (!word.equals("")) {
                stringBuilder.append(word);
                stringBuilder.append(" ");
            } else {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
