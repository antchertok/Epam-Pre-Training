package by.epam.pretraining.chertok.tasks.task9.model.textConverters;

import java.io.FileReader;
import java.io.IOException;

public enum  TextReader {
    TEXT_READER;

    public String readText(String path) throws FileNotOpenedException {
        try {
            StringBuilder sb = new StringBuilder();
            FileReader inputStream = new FileReader(path);
            int symbol;
            while ((symbol = inputStream.read()) != -1) {
                sb.append((char) symbol);
            }
            return sb.toString();
        } catch (IOException e) {
            throw new FileNotOpenedException(e);
        }
    }
}
