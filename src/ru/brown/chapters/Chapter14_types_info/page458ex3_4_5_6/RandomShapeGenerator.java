package ru.brown.chapters.Chapter14_types_info.page458ex3_4_5_6;

import java.util.Random;

public class RandomShapeGenerator {
    //"Фабрика", случайным образом создающая объекты:
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(5)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            case 4:
                return new Rectangle();
        }
    }
}