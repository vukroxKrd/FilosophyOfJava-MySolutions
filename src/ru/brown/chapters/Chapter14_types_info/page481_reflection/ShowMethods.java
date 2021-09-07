package ru.brown.chapters.Chapter14_types_info.page481_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static ru.brown.chapters.util.Print.print;
/********************** Exercise 17 **********************
 * Modify the regular expression in ShowMethods.java to
 * also strip off the keywords native and final.
 * (Hint: Use the OR operator '|'.)
 *********************************************************/

public class ShowMethods {
    private static String usage =
            "usage: ShowMethods qualified.class.name " +
                    "То show all methods in class or: " +
                    "ShowMethods qualified.class.name word " +
                    "То search for methods involving 'word'";
//    private static Pattern p = Pattern.compile("\\w+\\.");
    private static Pattern p =
            Pattern.compile("\\w+\\.|native\\s|final\\s");

    public static void main(String[] args) {
        if (args.length < 1) {
            print(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if (args.length == 1) {
                System.out.println("Displayint methods======");
                for (Method method : methods)
                    print(p.matcher(method.toString()).replaceAll(""));
                System.out.println("Displayint constructors======");
                for (Constructor ctor : ctors)
                    print(p.matcher(ctor.toString()).replaceAll(""));
                lines = methods.length + ctors.length;
            } else {
                for (Method method : methods)
                    if (method.toString().indexOf(args[1]) != -1) {
                        print(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                for (Constructor ctor : ctors)
                    if (ctor.toString().indexOf(args[1]) != -1) {
                        print(p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
            }
        } catch (ClassNotFoundException e) {
            print("No such class: " + e);
        }
    }
}
