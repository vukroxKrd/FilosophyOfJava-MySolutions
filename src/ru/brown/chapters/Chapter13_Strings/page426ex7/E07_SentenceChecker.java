package ru.brown.chapters.Chapter13_Strings.page426ex7;

public class E07_SentenceChecker {
    public static boolean matches(String text) {
        return text.matches("\\p{javaUpperCase}.*\\.");
    }

    public static void main(String[] args) {
        System.out.println(matches("This is correct."));
        System.out.println(matches("bad sentence 1."));
        System.out.println(matches("Bad sentence 2"));
        System.out.println(matches("This is also correct..."));
    }
}
