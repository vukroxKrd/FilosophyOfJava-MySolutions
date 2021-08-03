package ru.brown.chapters.Interfaces.page287ex19_factory;

import java.util.Random;

public class Cube implements Castable {

    public int cast;
    private int moves = 0;
    private static int MOVES = 4;

    public Cube() {
    }

    public Cube(int moves) {
        this.MOVES = moves;
    }


    @Override
    public void cast() {
        Random random = new Random(47);
        while (++moves != MOVES) {
            cast = random.nextInt(5);
            switch (cast) {
                case (0):
                    System.out.println(".");
                    break;
                case (1):
                    System.out.println(":");
                    break;
                case (2):
                    System.out.println(":.");
                    break;
                case (3):
                    System.out.println("::");
                    break;
                case (4):
                    System.out.println("::.");
                    break;
                case (5):
                    System.out.println("::");
                    System.out.println("..");
                    break;
            }
        }
    }
}
