package ru.brown.chapters.CollectionsObjects_Chapter11.page331_printing_containers;

import ru.brown.chapters.util.Print;

import java.util.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("Крыса");
        collection.add("Кошка");
        collection.add("Собака");
        collection.add("Собака");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("Крыса", "Анфиса");
        map.put("Кошка", "Мурка");
        map.put("Собака", "Шарик");
        map.put("Собака", "Бобик");
        return map;
    }

    public static void main(String[] args) {
        Print.print("ArrayList: "+fill(new ArrayList<String>()));
        Print.print("LinkedList: "+ fill(new LinkedList<String>()));
        Print.print("HashSet: "+ fill(new HashSet<String>()));
        Print.print("TreeSet: "+ fill(new TreeSet<String>()));
        Print.print("LinkedHashSet: "+ fill(new LinkedHashSet<String>()));
        Print.print("HashMap "+ fill(new HashMap<String, String>()));
        Print.print("TreeMap "+ fill(new TreeMap<String, String>()));
        Print.print("LinkedHashMap "+ fill(new LinkedHashMap<String, String>()));
    }
}
