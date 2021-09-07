package ru.brown.chapters.CollectionsObjects_Chapter11.page355_difficult_implement_collection;

import ru.brown.chapters.CollectionsObjects_Chapter11.page333.Pet;

import java.util.Arrays;

public class E30_CollectionSequence2 {
    public static void main(String[] args) {
        CollectionSequence2 c = new CollectionSequence2();
        CollectionSequence2.display(c);
        CollectionSequence2.display(c.iterator());
        System.out.println(Arrays.toString(c.toArray(new Pet[0])));
    }
}
