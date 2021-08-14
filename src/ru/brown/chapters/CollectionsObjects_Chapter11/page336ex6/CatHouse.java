package ru.brown.chapters.CollectionsObjects_Chapter11.page336ex6;

import ru.brown.chapters.util.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ru.brown.chapters.util.Print.print;

public class CatHouse {
    static Cat [] cats = {
            new Cat("Dusya"),
            new Cat("Busya"),
            new Cat("Vasya"),
            new Cat("Frosya")
    };
    static List<Cat> catList = new ArrayList<>(Arrays.asList(cats));
    static List<Cat> someCats = catList.subList(0,2);

    public static void main(String[] args) {
        print(catList);
        List<Cat> catList2 =new ArrayList<>(catList);
        print("Before remove");
        catList2.removeAll(someCats);
        print("After remove");
        print(someCats);
        print(catList2);
        print(catList);
    }
 }
