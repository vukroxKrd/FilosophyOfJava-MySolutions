package ru.brown.chapters.CollectionsObjects_Chapter11.page339ex10_rodent_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static ru.brown.chapters.util.Print.print;

public class Rodent10 {
    private static RandomRodentGenerator gen =
            new RandomRodentGenerator();

    public static void main(String[] args) {
        List<Rodent> rodentList = new ArrayList<Rodent>();
        for (int i = 0; i < 10; i++)
            rodentList.add(gen.next());
        Iterator<Rodent> it = rodentList.iterator();
        while (it.hasNext()) {
            Rodent r = it.next();
            print(r + ": ");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}