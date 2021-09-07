package ru.brown.chapters.Chapter13_Strings.page432ex8;

import java.util.Arrays;

public class Splitting {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herringf";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
//        split(" "); // Выражение может не содержать специальных символов
//        split("\\W+"); // Разбиение по символам, не являющимся символами слов
//        split("n\\W+"); // Буква 'n', за которой следуют символы,
        split("the|you");
        System.out.println(Splitting.knights.replaceAll(
                /*The embedded flag expression (?i) enables case-insensitive matching.
                The regular expression demonstrates how to handle mixed uppercase/lowercase
                vowels, (though none occur above). */
                "(?i)[aeiou]", "_"));
                // не являющиеся символами слов

    }
}