package ru.brown.chapters.CollectionsObjects_Chapter11.page328.ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Автоматическая упаковка
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}
