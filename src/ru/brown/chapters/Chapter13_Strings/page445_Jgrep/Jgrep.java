package ru.brown.chapters.Chapter13_Strings.page445_Jgrep;

import ru.brown.chapters.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jgrep {
    public static void main(String[] args) throws Exception {
//        if (args.length < 2) {
//            System.out.println("Usage: java 3Grep file regex");
//            System.exit(0);
//        }
        Pattern p = Pattern.compile("\\b[Ssct]\\w+", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
//        Pattern p = Pattern.compile("\\w+");

        // Перебор строк входного файла:
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile("C:\\Users\\slava\\Downloads\\text.txt")) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " +m.group() + ": " + m.start());
        }
    }
}