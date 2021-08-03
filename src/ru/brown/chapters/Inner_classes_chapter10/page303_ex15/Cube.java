package ru.brown.chapters.Inner_classes_chapter10.page303_ex15;

import java.util.Random;

public class Cube implements Castable {

    public int cast;
    private int moves = 0;
    private static int MOVES = 4;

    public Cube() {
    }

    public static CastableFactory factory = new CastableFactory() {
        public Castable getCastable () {
            return new Cube();
        }

        @Override
        public Castable getCastable(int castTimes) {
            return new Cube(castTimes);
        }
    };

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
