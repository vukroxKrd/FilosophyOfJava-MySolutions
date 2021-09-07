package ru.brown.chapters.Chapter13_Strings.page450;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import static ru.brown.chapters.util.Print.print;

public class ReplacingStringTokenizer {

    public static void main(String[] args) {
        String input = "But I'm not dead yet! I feel happy!";
        StringTokenizer stoke = new StringTokenizer(input);

        print("Tokenizer");
        while (stoke.hasMoreElements())
            System.out.print(stoke.nextToken() + " ");

        System.out.println();
        System.out.println();
        System.out.println("Arrays");
        System.out.println(Arrays.toString(input.split(" ")));

        System.out.println();
        print("Scanner");
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext())
            System.out.print(scanner.next() + " ");
    }
}