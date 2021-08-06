package ru.brown.chapters.CollectionsObjects_Chapter11.page327ex1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        int size = gerbils.size();
        System.out.println(size);

        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }

    }
}
