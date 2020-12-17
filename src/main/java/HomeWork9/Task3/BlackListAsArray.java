package HomeWork9.Task3;
import java.util.Arrays;
import java.util.List;

public class BlackListAsArray implements Sentence {
    private final String text;

    public BlackListAsArray(String text) {
        this.text = text;
    }

    public List<String> line() {
        return Arrays.asList(this.text.split(", "));
    }
}
