package ru.brown.chapters.CollectionsObjects_Chapter11.page338;

import ru.brown.chapters.CollectionsObjects_Chapter11.page333.*;

import java.util.*;

public class CrossContainerIteration {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>(Arrays.<Pet>asList(
                new Rat(),
                new Manx(),
                new Cymric(),
                new Mutt(),
                new Pug(),
                new Cymric(),
                new Pug()));
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS = new HashSet<Pet>(pets);
        TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
