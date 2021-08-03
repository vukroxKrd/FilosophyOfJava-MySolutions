package ru.brown.chapters.Interfaces.page266;

public class Ex2 {
    public static void main(String[] args) {
        // Nogo1 and Nogo2 cannot be instantiated:
//         Nogo1 ng1 = new Nogo1();
        // Nogo2 ng2 = new Nogo2();
        // But Nogo1() constructor called during instatiation of child:
        Go1 g1 = new Go1();
    }
}
