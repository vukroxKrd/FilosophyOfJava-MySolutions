package ru.brown.chapters.Chapter13_Strings.page436ex10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10_RegexCheck {
    public static void main(String[] args) {
        String input = "Java now has regular expressions";
        String regex1 = "^Java";
        String regex2 = "\\Breg.*";
        String regex3 = "n.w\\s+h(a|i)s";
        String regex4 = "s?";
        String regex5 = "s*";
        String regex6 = "s+";
        String regex7 = "s{4}";
        String regex8 = "s{1}.";
        String regex9 = "s{0,3}";
        String[] regexes = {regex1, regex2, regex3, regex4, regex5, regex6, regex7, regex8, regex9};

//        for (String next : regexes) {
//            Pattern p = Pattern.compile(next);
//            Matcher m = p.matcher(input);
//
//            System.out.println("Regex num: "+m.find());
//        }

        for (int i =0; i < regexes.length-1; i++) {
            Pattern p = Pattern.compile(regexes[i]);
            Matcher m = p.matcher(input);

            System.out.println("Regex num: "+i+" : isMatching "+m.find());
            while(m.find()) {
                System.out.println("Match \"" + m.group() +"\" at positions " +
                        m.start() + "-" + (m.end() - 1));
            }
        }


    }
}
