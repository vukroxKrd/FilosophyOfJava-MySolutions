package ru.brown.chapters.CollectionsObjects_Chapter11.page338ex8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEx8 {
    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        int size = gerbils.size();
        System.out.println(size);

        Iterator<Gerbil> iterator = gerbils.iterator();
        while (iterator.hasNext()){
            iterator.next().hop();
        }

    }
}
