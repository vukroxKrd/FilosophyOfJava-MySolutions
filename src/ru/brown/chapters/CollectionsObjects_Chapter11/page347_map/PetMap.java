package ru.brown.chapters.CollectionsObjects_Chapter11.page347_map;

import ru.brown.chapters.CollectionsObjects_Chapter11.page333.Cat;
import ru.brown.chapters.CollectionsObjects_Chapter11.page333.Dog;
import ru.brown.chapters.CollectionsObjects_Chapter11.page333.Hamster;
import ru.brown.chapters.CollectionsObjects_Chapter11.page333.Pet;

import java.util.HashMap;
import java.util.Map;

import static ru.brown.chapters.util.Print.print;

public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("Му Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        print(petMap);
        Pet dog = petMap.get("Му Dog");
        print(dog);
        print(petMap.containsKey("Му Dog"));
        print(petMap.containsValue(dog));
    }
}