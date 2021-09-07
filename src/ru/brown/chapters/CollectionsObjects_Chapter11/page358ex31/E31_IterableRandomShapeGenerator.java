package ru.brown.chapters.CollectionsObjects_Chapter11.page358ex31;

import ru.brown.chapters.Polymorphism.page244polymorph.Shape;

public class E31_IterableRandomShapeGenerator {
    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator(10);
        for (Shape shape : rsg)
            System.out.println(shape.getClass().getSimpleName());
    }
}
