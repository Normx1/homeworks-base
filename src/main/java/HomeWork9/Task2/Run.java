package HomeWork9.Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {
        List<String> lines = FileRead();
        File result = new File("NewFile.txt");
        try (BufferedWriter lineWriter = new BufferedWriter(new FileWriter(result))) {
            for (String line : lines) {
                List<String> sentenc = Arrays.asList(line.split(" "));
                if (TextFormater.LimetedSentence(sentenc) == true || TextFormater.ifWordIsPolindrom(sentenc) == true) {
                    lineWriter.write(line);
                    lineWriter.newLine();
                }
            }

    } catch (IOException e) {
            throw new RuntimeException("Failed to write results to " + result.getAbsolutePath(), e);

        }
    }
    public static List<String> FileRead() {
        File sentences = new File("SimpleFile.txt");
        try (FileReader fileReader = new FileReader(sentences);
             BufferedReader linesReader = new BufferedReader(fileReader)) {
            return linesReader.lines().collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException("Failed to read file " + sentences.getAbsolutePath(), e);
        }
    }
}
