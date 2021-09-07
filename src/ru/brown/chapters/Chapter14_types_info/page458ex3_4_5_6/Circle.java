package ru.brown.chapters.Chapter14_types_info.page458ex3_4_5_6;

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
