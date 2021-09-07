package ru.brown.chapters.Chapter13_Strings.page448_sc_delimiters;

import java.util.Scanner;

import static ru.brown.chapters.util.Print.print;

public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        print(scanner.delimiter());

        while(scanner.hasNextInt())
            System.out.println(scanner.nextInt());
    }
}
