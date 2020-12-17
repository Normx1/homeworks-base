package HomeWork9.Task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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

    public boolean equals(Object obj) {
        return obj == this;
    }

    public static void main(String[] args) {
        int numFaildSentence = 0;
        List<String> originalText = FileRead("Task3-Text1.txt");
        List<String> blackList = FileRead("BlackList.txt");
        ArrayList<List> faildSentences = new ArrayList();
        Sentence blackSentence = new BlackListAsArray(blackList.get(0));
        for (String word : originalText) {
            Sentence sentence = new TextAsArray(word);
            for (int i = 0; i < blackSentence.line().size(); i++) {
                for (int j = 0; j < sentence.line().size(); ++j) {
                    if ((sentence.line().get(j)).equals(blackSentence.line().get(i))) {
                        ++numFaildSentence;
                        if (!faildSentences.contains(sentence.line())) {
                            faildSentences.add(sentence.line());
                        }
                    }
                }
            }
        }
            if (numFaildSentence > 0) {
                System.out.println("Всего повторений запрещенных слов: " + numFaildSentence);
                System.out.println("Запрещенные слова в следующих предложениях: ");


                for (List sents : faildSentences) {
                    for (Object word : sents)
                        System.out.print(word + " ");
                    System.out.println();
                }
            } else {
                System.out.println("Текст прошел проверку");
            }
        }
    }
