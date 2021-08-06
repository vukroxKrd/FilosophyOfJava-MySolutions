package ru.brown.chapters.Inner_classes_chapter10.page319_overriding_inner_classes;

import ru.brown.chapters.util.Print;

public class BigEgg2 extends Egg2 {
    //ключ к переопределению внутреннего класса - наследование внутреннего класа от внутреннего класса.
    //наследования от родителя не хватает
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            Print.print("BigEgg2.Yolk()");
        }
        public void f() {
            Print.print("BigEgg2.Yolk.f()");
        }
    }

    public BigEgg2() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}