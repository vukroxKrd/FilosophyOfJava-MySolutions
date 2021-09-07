package ru.brown.chapters.CollectionsObjects_Chapter11.page341ex14;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex14 {

    static void addMiddle(LinkedList<Integer> l, Integer[] ia) {

        for(Integer i : ia) {
            ListIterator<Integer> it = l.listIterator((l.size())/2);
            it.add(i);
            System.out.println(l);
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();
        Integer[] x = {11, 19, 34, 88, 97, 2, 134, 200};
        Ex14.addMiddle(li, x);
    }
}
