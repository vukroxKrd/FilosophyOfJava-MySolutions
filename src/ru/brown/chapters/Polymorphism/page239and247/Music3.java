package ru.brown.chapters.Polymorphism.page239and247;

public class Music3 {

    //Работа метода независит от фактического типаобъекта,
//поэтому типы,добавленные в систему,будут работать правильно:
    public static void tune(Instrument instrument) {
        if (instrument instanceof Wind) {
            instrument.play(Note.DO);
        } else if (instrument instanceof Percussion) {
            instrument.play(Note.RE);
        } else if (instrument instanceof Stringer) {
            instrument.play(Note.MI);
        }
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {

        //Восходящее преобразование при добавлении в массив:
        RandomInstrumentGenerator generator = new RandomInstrumentGenerator();
        Instrument[] orchestra = new Instrument[5];

        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = generator.generateRandomInstrument();
        }
        tuneAll(orchestra);
    }
}
