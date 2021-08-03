package ru.brown.chapters.inner_classes.page295_ex1.sec_class_pack;

import ru.brown.chapters.inner_classes.page295_ex1.class_package.Pedestrian;
import ru.brown.chapters.inner_classes.page295_ex1.interface_package.Movable;

public class Runner extends Pedestrian {
    Pedestrian pedestrian = new Pedestrian();

    public Movable getLegs (){
        return new Legs();
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.getLegs().move();
    }
}
