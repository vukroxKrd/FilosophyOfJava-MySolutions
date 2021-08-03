package ru.brown.chapters.Inner_classes_chapter10.page305_classes_inside_interfaces;

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("Hello!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}