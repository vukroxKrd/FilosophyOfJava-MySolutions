package ru.brown.chapters.Inner_classes_chapter10.page291inner_to_outer_access;

import java.util.ArrayList;
import java.util.Iterator;

public class Sequence {

    private ArrayList<Object> items;
    private int next = 0;

    public Selector selector() {
        return new SequenceSelector();
    }

    public void test() { System.out.println("Sequence.test()"); }
    public Sequence(int size) {
        items = new ArrayList<>(size);
    }
    public void add(Object x) {
            items.add(x);
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        public Sequence getSequence(){
            return Sequence.this;
        }

        public SequenceSelector getNewSeqSelector(){
            Sequence sequence = getSequence();
            Sequence.SequenceSelector selector = sequence.new SequenceSelector();
            return selector;
        }

        public boolean end() {
            return i == items.size();
        }
        public Object current() {
            return items.get(i);
        }
        public void next() {
            if (i < items.size()) i++;
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        sequence.add(new TextLine("Slava"));
        sequence.add(new TextLine("Liza"));
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        // cast and test:
        ((SequenceSelector)selector).getSequence().test();
    }
}