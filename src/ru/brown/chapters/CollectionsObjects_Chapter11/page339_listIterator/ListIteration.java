package ru.brown.chapters.CollectionsObjects_Chapter11.page339_listIterator;

import ru.brown.chapters.CollectionsObjects_Chapter11.page333.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<Pet>(Arrays.<Pet>asList(
                new Rat(),
                new Manx(),
                new Cymric(),
                new Mutt(),
                new Pug(),
                new Cymric(),
                new Pug()));
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext())
            System.out.print("previous: "+it.previousIndex() + ", current: "+ it.next() + ", next: " + it.nextIndex() + ";");
        System.out.println();

        // В обратном направлении:
        while (it.hasPrevious())
            System.out.print(it.previous().id() + " ");

        System.out.println();
        System.out.println(pets);

        it = pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set(new Manx());
        }
        System.out.println(pets);
    }
}