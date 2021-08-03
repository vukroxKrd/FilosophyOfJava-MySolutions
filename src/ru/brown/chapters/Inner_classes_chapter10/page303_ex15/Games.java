package ru.brown.chapters.Inner_classes_chapter10.page303_ex15;

public class Games {
    public static void playGame(CastableFactory factory) {
        Castable game = factory.getCastable();
        game.cast();
    }

    public static void playGame(CastableFactory factory, int castTimes) {
        Castable game = factory.getCastable(castTimes);
        game.cast();
    }

    public static void main(String[] args) {
//        playGame(new CoinFactory());
//        playGame(new CubeFactory());

        playGame(Coin.factory);
        playGame(Coin.factory, 4);
    }
}
