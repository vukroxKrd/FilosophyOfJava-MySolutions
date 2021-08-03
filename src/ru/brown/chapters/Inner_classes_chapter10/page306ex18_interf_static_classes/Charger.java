package ru.brown.chapters.Inner_classes_chapter10.page306ex18_interf_static_classes;

import ru.brown.chapters.util.Print;

public interface Charger {
    boolean isOn(String power);

    class UsbCable implements Charger {

        @Override
        public boolean isOn(String power) {
            if (power == "220") {
                Print.print(power);
                return true;
            } else return false;
        }

        public static void main(String[] args) {
            new UsbCable().isOn("220");
        }
    }
}
