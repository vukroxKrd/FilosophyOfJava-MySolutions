package ru.brown.chapters.Polymorphism.page248;

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Super();//Upcast
        System.out.println("sup.field= " + sup.field + ",sup.getField()=" + sup.getField());


        Sub sub = new Sub();
        System.out.println("sub.field=" + sub.field + ",sub.getField()=" + sub.getField() + ",sub.getSuperField()=" + sub.getSuperField());
    }
}
