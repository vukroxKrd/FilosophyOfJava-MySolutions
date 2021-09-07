package ru.brown.chapters.CollectionsObjects_Chapter11.page341ex13_greenhousecontrols_withlinkedlist_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    // Класс из пакета java.util для хранения объектов Event:
    private List<Event> eventList = new LinkedList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public Iterator getIterator(List list) {
        return list.iterator();
    }

    public void run() {
        LinkedList<Event> events = new LinkedList<>(eventList);
        Iterator<Event> iterator = getIterator(events);

        while (iterator.hasNext()) {
            Event e = iterator.next();
            if (e.ready()) {
                System.out.println(e);
                e.action();
                iterator.remove();
                eventList.remove(e);
            }
        }
    }
}