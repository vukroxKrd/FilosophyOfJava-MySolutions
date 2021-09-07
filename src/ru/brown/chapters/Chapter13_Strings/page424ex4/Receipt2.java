package ru.brown.chapters.Chapter13_Strings.page424ex4;

import java.util.Formatter;
import java.util.Locale;

public class Receipt2 {
    public static final int ITEM_WIDTH = 20;
    public static final int QTY_WIDTH = 10;
    public static final int PRICE_WIDTH = 15;

    private static final String TITLE_FRMT =
            "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + "s\n";
    private static final String ITEM_FRMT =
            "%-" + ITEM_WIDTH + "." + ITEM_WIDTH + "s %" + QTY_WIDTH + "d %" + PRICE_WIDTH + ".2f\n";
    private static final String TOTAL_FRMT =
            "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + ".2f\n";
    private double total = 0;
    Formatter f = new Formatter(System.out, Locale.US);

    public void printTitle() {
        f.format(TITLE_FRMT, "Item", "Qty", "Price");
        f.format(TITLE_FRMT, "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(ITEM_FRMT, name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(TOTAL_FRMT, "Tax", "", total * 0.06);
        f.format(TITLE_FRMT, "", "", "-----");
        f.format(TOTAL_FRMT, "Total", "", total * 1.06);
    }
}

