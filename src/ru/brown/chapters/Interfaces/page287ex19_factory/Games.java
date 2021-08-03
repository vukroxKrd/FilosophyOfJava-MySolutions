package ru.brown.chapters.Interfaces.page287ex19_factory;

public class Games {
    public static void playGame(CastableFactory factory){
        Castable game = factory.getCastable();
        game.cast();
    }

    public static void playGame(CastableFactory factory, int castTimes){
        Castable game = factory.getCastable(castTimes);
        game.cast();
    }

    public static void main(String[] args) {
//        playGame(new CoinFactory());
//        playGame(new CubeFactory());
        playGame(new CoinFactory(),8);
        playGame(new CubeFactory(),7);
    }
}
