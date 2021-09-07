package ru.brown.chapters.Chapter13_Strings.page438_groups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ru.brown.chapters.util.Print.print;
import static ru.brown.chapters.util.Print.printnb;

public class Groups {

    public static final String РОЕМ =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w+");
        Pattern last3words = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$");
        Matcher m = p.matcher(Groups.РОЕМ);
        while (m.find()) {
            for (int j = 0; j <= m.groupCount(); j++) {
                printnb("[" + m.group(j) + "]");
                print(m.start() + " - " + m.end());
            }
            System.out.println();
        }
    }
}