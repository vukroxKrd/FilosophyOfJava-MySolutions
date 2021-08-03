package ru.brown.chapters.inner_classes.page297_random_visibility;

public class Parcel6 {

    private void internalTracking(boolean b) {
        //Создание нового класса вложено в if-блок
        if (b) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String s) {
                    id = s;
                }

                String getSlip() {
                    return id;
                }

            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();

        }
// Здесь использовать нельзя! Вне области действия:
//! TrackingSlip ts = new TrackingSlip("x");

    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
