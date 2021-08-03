package ru.brown.chapters.Polymorphism.page244polymorph;

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
