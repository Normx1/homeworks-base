package HomeWork9.Task3;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static List<String> FileRead(String nameOfFile) {
        File sentences = new File(nameOfFile);
        try (FileReader fileReader = new FileReader(sentences);
             BufferedReader linesReader = new BufferedReader(fileReader)) {
            return linesReader.lines().collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException("Failed to read file " + sentences.getAbsolutePath(), e);
        }
    }

    public static void main(String[] args) {
        List<String> originalText = FileRead("Task3-Text1.txt");
        List<String> blackList = FileRead("BlackList.txt");
        for (String word : originalText) {

        }
    }
}
