package ru.brown.chapters.Chapter13_Strings.page448ex20;

import java.util.Locale;
import java.util.Scanner;

/********************** Exercise 20 *********************
 * Create a class that contains int, long, float and double
 * and String fields. Create a constructor for this class
 * that takes a single String argument, and scans that
 * string into the various fields. Add a toString() method
 * and demonstrate that your class works correctly.
 ********************************************************/

public class DataHolder2 {
    private int i;
    private long l;
    private float f;
    private double d;
    private String s;

    DataHolder2(String data) {
        Scanner stdin = new Scanner(data);
        stdin.useLocale(Locale.US);
        i = stdin.nextInt();
        l = stdin.nextLong();
        f = stdin.nextFloat();
        d = stdin.nextDouble();
        s = stdin.next("\\w+");
    }

    public String toString() {
        return i + " " + l + " " + f + " " + d + " " + s;
    }
}

