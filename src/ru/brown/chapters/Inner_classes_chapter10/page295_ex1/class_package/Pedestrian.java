package ru.brown.chapters.inner_classes.page295_ex1.class_package;

import ru.brown.chapters.inner_classes.page295_ex1.interface_package.Movable;

public class Pedestrian {
    protected class Legs implements Movable{
        public Legs(){};
        private int speed = 5;
        @Override
        public void move() {
            System.out.println(speed);
        }
    }
}
