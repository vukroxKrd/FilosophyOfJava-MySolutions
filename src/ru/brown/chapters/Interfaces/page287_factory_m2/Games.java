package ru.brown.chapters.Interfaces.page287_factory_m2;

public class Games {

    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move()) ;
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
