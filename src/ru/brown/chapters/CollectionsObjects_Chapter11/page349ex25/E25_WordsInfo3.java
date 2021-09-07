package ru.brown.chapters.CollectionsObjects_Chapter11.page349ex25;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class E25_WordsInfo3 {

    private static String readLineByLineJava8(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }

    public static Map<String, ArrayList<Integer>> dictionaryCreator(String path) {
        Map<String, ArrayList<Integer>> wordItsPositionMap = new HashMap<>();
        int wordPosition = 0;
        String text = readLineByLineJava8(path);
        for (String nextWord : text.split("\\W+")) {
            ArrayList<Integer> positionsList = wordItsPositionMap.get(nextWord);
            if (positionsList == null) {
                positionsList = new ArrayList<Integer>();
                wordItsPositionMap.put(nextWord, positionsList);
            }
            positionsList.add(++wordPosition);
        }
        return wordItsPositionMap;
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> article = dictionaryCreator("C:\\Users\\slava\\Downloads\\text.txt");

        String input = readLineByLineJava8("C:\\Users\\slava\\Downloads\\text.txt");
        String[] array = input.split("\\W+");
        List<String> origWords = Arrays.asList(array);


        // Now recreate the original order of the words.
        // We will use an inverted structure, where the key
        // is the position of the word in the file. Also,
        // we will sort words based on their positions.
        TreeMap<Integer, String> words = new TreeMap<Integer, String>();
        for (Map.Entry<String, ArrayList<Integer>> entry : article.entrySet())
            for (Integer pos : entry.getValue())
                words.put(pos, entry.getKey());
        // Test the correctness.
        System.out.println(origWords);
        System.out.println(words.values());
    }
}