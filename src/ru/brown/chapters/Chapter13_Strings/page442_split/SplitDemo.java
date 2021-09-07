package ru.brown.chapters.Chapter13_Strings.page442_split;

import java.util.Arrays;
import java.util.regex.Pattern;

import static ru.brown.chapters.util.Print.print;

public class SplitDemo {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(Pattern.compile("!!").split(input)));

        // Only do the first three:
        print(Arrays.toString(Pattern.compile("!!").split(input, 2)));
    }
}