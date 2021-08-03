package ru.brown.chapters.Inner_classes_chapter10.page309.ex20reverseSelector;

public class Test {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        sequence.add(10);
        Selector selector = sequence.sequenceSelector();
        System.out.println(selector.current());
        selector.next();
        System.out.println(selector.current());
    }

}
