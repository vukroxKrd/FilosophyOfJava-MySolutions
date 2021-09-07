package ru.brown.chapters.Chapter14_types_info.page458ex3_4_5_6;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect is drawn");
    }

    @Override
    public void erase() {
        System.out.println("Rect is erased");
    }

    @Override
    public void color() {
        System.out.println("Rect is colored");
    }
}
