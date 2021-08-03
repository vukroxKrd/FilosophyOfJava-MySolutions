package ru.brown.chapters.Interfaces.page266ex3;


class Son extends Dad {
    private int i = 1;

    @Override
    protected void print() {
        System.out.println("Son.i = " + i);
    }
}