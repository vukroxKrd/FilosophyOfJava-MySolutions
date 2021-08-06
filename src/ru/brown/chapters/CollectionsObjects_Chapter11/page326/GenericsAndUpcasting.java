package ru.brown.chapters.CollectionsObjects_Chapter11.page326;

import java.util.ArrayList;

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple с : apples)
            System.out.println(с.getClass().getSimpleName());
    }
}