package ru.brown.chapters.Inner_classes_chapter10.page298_anon_class_with_constructor;

public class Parcel8 {
    public Wrapping wrapping(int x) {
// Вызов конструктора базового класса:
        return new Wrapping(x) { // Передача аргумента конструктору
            public int value() {
                return super.value() * 47;
            }
        }; // Точка с запятой необходима
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}

