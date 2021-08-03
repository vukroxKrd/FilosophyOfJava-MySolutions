package ru.brown.chapters.Polymorphism.page244polymorph;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void color() {
        System.out.println("Circle is colored");
    }
}
