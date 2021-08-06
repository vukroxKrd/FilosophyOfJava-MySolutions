package ru.brown.chapters.Inner_classes_chapter10.page318_overriding_innerClasses;

import ru.brown.chapters.util.Print;

public class BigEgg extends Egg {

    public class Yolk {
        public Yolk() {
            Print.print("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}