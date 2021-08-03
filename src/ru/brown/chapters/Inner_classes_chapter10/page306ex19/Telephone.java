package ru.brown.chapters.Inner_classes_chapter10.page306ex19;

public class Telephone extends Device{
    @Override
    public boolean isCharging(Charger charger) {
        if (charger.isOn(Signal.NONE) || charger.isOn(Signal.LOW)) {
            return false;
        }else {
            return true;
        }
    }
}
