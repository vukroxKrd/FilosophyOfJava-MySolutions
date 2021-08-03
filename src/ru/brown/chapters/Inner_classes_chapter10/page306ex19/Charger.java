package ru.brown.chapters.Inner_classes_chapter10.page306ex19;

public interface Charger {
    boolean isOn(Signal signal);

    class WirelessCharger implements Charger{
        private Signal signal;

        @Override
        public boolean isOn(Signal signal) {
            if (signal == Signal.LOW || signal == Signal.NONE ) {
                return false;
            }else return true;
        }

        public static void connect(Device device){
            WirelessCharger charger = new WirelessCharger();
            charger.isOn(Signal.GOOD);
            System.out.println(device.isCharging(charger));
        }
    }
}