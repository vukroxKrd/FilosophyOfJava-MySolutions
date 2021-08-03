package ru.brown.chapters.inner_classes.page290ex1;

public class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    public Outer() {
        System.out.println("Outer");
    }

    Inner getInner (){
        return new Inner();
    }
    class Inner {
        public Inner() {
            System.out.println("Inner");
        }
        @Override
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer("Slava");
        Outer.Inner inner = outer.getInner();
        System.out.println(inner.toString());
    }
}
