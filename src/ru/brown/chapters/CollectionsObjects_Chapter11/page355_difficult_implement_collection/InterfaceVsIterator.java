package ru.brown.chapters.CollectionsObjects_Chapter11.page355_difficult_implement_collection;

import ru.brown.chapters.CollectionsObjects_Chapter11.page333.Pet;

import java.util.Collection;
import java.util.Iterator;

public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + "");
        }
        System.out.println();

    }

    public static void display(Collection<Pet> pets) {
        for (Pet p : pets)
            System.out.print(p.id() + ":" + p + "");
        System.out.println();
    }
}


