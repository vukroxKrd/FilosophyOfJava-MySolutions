package ru.brown.chapters.CollectionsObjects_Chapter11.page332ex4;

import ru.brown.chapters.util.Print;

import java.util.*;

public class HeroGenerator {
    static Random random = new Random(47);

    public static String next() {
        String heroName = "";
        int randomizer = random.nextInt(5);
        switch (randomizer) {
            case (0):
                heroName = "Magneto";
                break;
            case (1):
                heroName = "ProfessorX";
                break;
            case (2):
                heroName = "Rogue";
                break;
            case (3):
                heroName = "Wolverine";
                break;
            case (4):
                heroName = "Apocalypse";
                break;
            default:
                heroName = "SomeNoName";
                break;
        }
        return heroName;
    }
    // Можно ли реализовать фабрику коллекций, чтобы каждый раз в main руками не инициализировать новую коллекцию?
    //Это моя попытка это выполнить
    public static Collection<String> nextCollection() {
        Collection<String> collection = null;
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case (0):
                    collection = new ArrayList<String>();
                    break;
                case (1):
                    collection = new LinkedList<String>();
                    break;
                case (2):
                    collection = new HashSet<String>();
                    break;
                case (3):
                    collection = new TreeSet<String>();
                    break;
                case (4):
                    collection = new LinkedHashSet<String>();
                    break;
            }
        }
        return collection;
    }

    static Collection fill(Collection<String> heroCollection, String hero) {
        heroCollection.add(hero);
        return heroCollection;
    }


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        HashSet<String> hashSet = new HashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        for (int i = 0; i < 10; i++) {

            String hero = next();
            fill(arrayList, hero);
            fill(linkedList, hero);
            fill(hashSet, hero);
            fill(treeSet, hero);
            fill(linkedHashSet, hero);

        }
        Print.print(arrayList);
        Print.print(linkedList);
        Print.print(hashSet);
        Print.print(treeSet);
        Print.print(linkedHashSet);
    }
}
