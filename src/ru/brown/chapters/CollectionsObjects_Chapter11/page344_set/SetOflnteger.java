package ru.brown.chapters.CollectionsObjects_Chapter11.page344_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOflnteger {

    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }
}