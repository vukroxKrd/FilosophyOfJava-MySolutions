package ru.brown.chapters.CollectionsObjects_Chapter11.page358_adapter_for_iteratror;

import java.util.Arrays;

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList(
                Arrays.asList("To be or not to be".split("")));
        //Получение обычного итератора при помощи iterator():
        for (String s : ral)
            System.out.print(s + "");
        System.out.println();
        //Передача реализации Iterable no вашему выбору
        for (String s : ral.reversed())
            System.out.print(s + "");
    }
}
