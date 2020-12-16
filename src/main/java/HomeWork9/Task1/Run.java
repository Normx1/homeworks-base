package HomeWork9.Task1;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) throws IOException {
        List<String> words = ReadFile();
        File newList = new File("Task1_New1.txt");
        try (BufferedWriter lineWriter = new BufferedWriter(new FileWriter(newList))) {
            for (String word : words) {
                int b = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
                        b++;
                    }
                    if (b == word.length() - 1) {
                        lineWriter.write(word);
                        lineWriter.newLine();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to write results to " + newList.getAbsolutePath(), e);
        }
    }


    public static List<String> ReadFile() {
        File word = new File("Task1_Old_File.txt");
        try (FileReader fileRead = new FileReader(word)) {
            BufferedReader bufferedReader = new BufferedReader(fileRead);
            return bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file " + word.getAbsolutePath(), e);
        }
    }
}
