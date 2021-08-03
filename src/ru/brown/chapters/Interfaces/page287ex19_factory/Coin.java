package ru.brown.chapters.Interfaces.page287ex19_factory;

import java.util.Random;

public class Coin implements Castable {

    public int tails = 0;
    public int heads = 1;
    public int cast;

    private int moves = 0;
    private static int MOVES = 4;

    public Coin() {
    }

    public Coin(int moves) {
        this.MOVES = moves;
    }


    @Override
    public void cast() {
        Random random = new Random(47);
        while (moves++ != MOVES) {
            cast = random.nextInt(2);
            if (cast == tails) {
                System.out.println("TAILS");
            } else if (cast == heads) {
                System.out.println("HEADS");
            }
        }
    }
}
