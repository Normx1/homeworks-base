package HomeWork9.Task3;

import java.util.Arrays;
import java.util.List;

public class TextAsArray implements Sentence {
    private final String text;

    public TextAsArray(String text) {
        this.text = text;
    }

    public List<String> line() {
        return Arrays.asList(this.text.split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?"));
    }
}