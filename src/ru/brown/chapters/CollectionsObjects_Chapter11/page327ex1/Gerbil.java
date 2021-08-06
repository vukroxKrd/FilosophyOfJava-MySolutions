package ru.brown.chapters.CollectionsObjects_Chapter11.page327ex1;

import java.util.ArrayList;

public class Gerbil {
    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }
    public void hop(){
        System.out.println("Gerbil number "+this.gerbilNumber+" hops");
    }
}
