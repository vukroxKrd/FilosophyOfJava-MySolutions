package ru.brown.chapters.Chapter13_Strings.page436ex11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ru.brown.chapters.util.Print.print;
import static ru.brown.chapters.util.Print.printnb;

public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
        while (m.find())
            print(m.group() + " ");
        System.out.println();
        int i = 0;
        while (m.find(i)) {
            printnb(m.group() + " ");
            i++;
        }
    }
}
