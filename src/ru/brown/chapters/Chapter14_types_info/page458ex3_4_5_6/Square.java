package ru.brown.chapters.Chapter14_types_info.page458ex3_4_5_6;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw");
    }

    @Override
    public void erase() {
        System.out.println("Square.eraseQ");
    }

    @Override
    public void color() {
        System.out.println("Square is colored");
    }
}