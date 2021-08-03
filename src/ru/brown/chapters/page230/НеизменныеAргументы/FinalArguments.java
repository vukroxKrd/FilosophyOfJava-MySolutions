package ru.brown.chapters.page230.НеизменныеAргументы;

public class FinalArguments {

    void with(final Gizmo g) {
        //! g = new Gizmo()j // Запрещено -- g объявлено final
    }

    void without(Gizmo g) {
        g = new Gizmo(); // Разрешено -- g не является fin a l
        g.spin();
    }

//    void f( final int i) { i++; } // Нельзя изменять неизменные примитивы доступны только для чтения:

    int g(final int i) {
        return i + 1;
    }
    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
        System.out.println(bf.g(3));
    }

}