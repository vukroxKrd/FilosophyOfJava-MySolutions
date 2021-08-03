package ru.brown.chapters.Interfaces.page279;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable {
    private static Random rand = new Random(47);
    private static final char[] capitals =
            "ABCDEFGHI1KLMN0PQRSTUVWXYZ".toCharArray();
    private static final char[] lowers =
            "abcdefghij klmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels =
            "aeiou".toCharArray();
    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if (count-- == 0)
            return -1; // Признак конца входных данных
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10; // Количество присоединенных символов
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
        Scanner s1 = new Scanner(new AdaptedRandomDoubles(4));
        while (s1.hasNext()){
            System.out.println(s1.nextDouble()+ " ");
        }
    }
}

