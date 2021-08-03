package ru.brown.chapters.Polymorphism.page239and247;

import java.util.Random;

public class RandomInstrumentGenerator {
    Random random = new Random(47);
    public Instrument generateRandomInstrument(){
        switch (random.nextInt(5)){
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringer();
            case 3:
                return new WoodWind();
            case 4:
                return new Brass();
        }
    }
}
