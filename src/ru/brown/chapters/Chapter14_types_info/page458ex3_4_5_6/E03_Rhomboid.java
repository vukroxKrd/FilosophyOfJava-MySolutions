package ru.brown.chapters.Chapter14_types_info.page458ex3_4_5_6;

import java.util.Arrays;
import java.util.List;

public class E03_Rhomboid {
    public static void main(String[] args) {
        List<Shape> shapes =
                Arrays.asList(
                        new Circle(),
                        new Square(),
                        new Triangle(),
                        new Rhomboid());
        for (Shape shape : shapes)
            shape.draw();
        // Upcast to shape:
        Shape shape = new Rhomboid();
        // Downcast to Rhomboid:
        Rhomboid r = (Rhomboid) shape;
        // Downcast to Circle. Succeeds at compile time,
        // but fails at runtime with a ClassCastException:
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
        }
    }
}