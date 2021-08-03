package ru.brown.chapters.Interfaces.page266ex4;

public class Ex4 {
    public static void testPrint(Dad d) {
        ((Son) d).print();
    }

    public static void secondTestPrint(SecondDad sd) {
        sd.print();
    }

    public static void main(String[] args) {
        Son s = new Son();
        Ex4.testPrint(s);
        SecondSon ss = new SecondSon();
        Ex4.secondTestPrint(ss);
    }
}
