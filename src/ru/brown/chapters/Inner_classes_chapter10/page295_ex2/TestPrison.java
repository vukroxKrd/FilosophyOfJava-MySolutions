package ru.brown.chapters.inner_classes.page295_ex2;

public class TestPrison {
    public static void main(String[] args) {
        Prison prison = new Prison();
        Prison.Guard guard = prison.new Guard();
        Prison prison1 = guard.getPrison();
        System.out.println(prison1);
        System.out.println(guard.getBat());
        System.out.println(prison);
        prison.cellChange();

    }
}
