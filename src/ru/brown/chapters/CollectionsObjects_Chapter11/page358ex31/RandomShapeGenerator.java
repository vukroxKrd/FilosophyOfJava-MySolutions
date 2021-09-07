package ru.brown.chapters.CollectionsObjects_Chapter11.page358ex31;


import ru.brown.chapters.Polymorphism.page244polymorph.Circle;
import ru.brown.chapters.Polymorphism.page244polymorph.Shape;
import ru.brown.chapters.Polymorphism.page244polymorph.Square;
import ru.brown.chapters.Polymorphism.page244polymorph.Triangle;

import java.util.Iterator;
import java.util.Random;

class RandomShapeGenerator implements Iterable<Shape> {
    private Random rand = new Random(47);
    private final int quantity;

    RandomShapeGenerator(int quantity) {
        this.quantity = quantity;
    }

    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int count;

            public boolean hasNext() {
                return count < quantity;
            }

            public Shape next() {
                ++count;
                return nextShape();
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    private Shape nextShape() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}