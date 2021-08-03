package ru.brown.chapters.Inner_classes_chapter10.page310_closure;

public class Calee3 extends MyIncrement implements Incrementable{
    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}
