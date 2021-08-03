package ru.brown.chapters.Inner_classes_chapter10.page297_anonymous_inner_classes;



public class Parcel7 {

    public Contents contents() {
        return new Contents() { // Вставка определения класса
            private int i = 11;
            public int value() {
                return i;
            }
        }; // Точка с запятой здесь необходима
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents с = p.contents();
    }
}

