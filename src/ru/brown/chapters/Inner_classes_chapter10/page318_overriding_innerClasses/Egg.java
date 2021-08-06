package ru.brown.chapters.Inner_classes_chapter10.page318_overriding_innerClasses;

import ru.brown.chapters.util.Print;

class Egg {

    private Yolk у;
    protected class Yolk {
        public Yolk() {
            Print.print("Egg.Yolk()");
        }
    }

    public Egg() {
        Print.print("New Egg()");
        у = new Yolk();
    }
}


