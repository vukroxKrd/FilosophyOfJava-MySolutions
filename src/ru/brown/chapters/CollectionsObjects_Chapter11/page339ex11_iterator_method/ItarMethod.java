package ru.brown.chapters.CollectionsObjects_Chapter11.page339ex11_iterator_method;

import ru.brown.chapters.util.Print;

import java.util.Collection;
import java.util.Iterator;

public class ItarMethod {

    public static void printAny(Collection collection){
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            Print.print(o.toString());
        }
    }
}
