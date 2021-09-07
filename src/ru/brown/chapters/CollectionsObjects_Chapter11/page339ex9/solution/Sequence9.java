package ru.brown.chapters.CollectionsObjects_Chapter11.page339ex9.solution;

import java.util.ArrayList;
import java.util.Iterator;

public class Sequence9 {
    private ArrayList<Object> items = new ArrayList<Object>();

    public void add(Object x) {
        items.add(x);
    }

    public Iterator iterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        Sequence9 sequence = new Sequence9();
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}

