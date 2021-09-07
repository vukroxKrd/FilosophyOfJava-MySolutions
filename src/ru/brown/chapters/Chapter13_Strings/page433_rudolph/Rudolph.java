package ru.brown.chapters.Chapter13_Strings.page433_rudolph;

public class Rudolph {
    public static void main(String[] angs) {
        for (String pattern : new String[]{
                "Rudolph",
                "[rR]udolph",
                "[rR][aeiou][a-z]ol.*",
                "R.*"})
            System.out.println("Rudolph".matches(pattern));
    }
}