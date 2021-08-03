package ru.brown.chapters.page223.use_of_protected;

public class Elf extends Goody {
    private int elfNumber;
    private int numArrows;

    public Elf(String name, int numArrows, int elfNumber) {
        super(name);
        this.elfNumber = elfNumber;
        this.numArrows = numArrows;
    }

    public void change(String name, int... arrowsAndOrNumber) {
        set(name); // Доступно, так как объявлено protected
        int value;
        int length = arrowsAndOrNumber.length;
        if (length == 1) {
            this.numArrows = arrowsAndOrNumber[0];
        } else
            for (int i = 0; i < arrowsAndOrNumber.length; i++) {
                value = arrowsAndOrNumber[i];
                if (i == 0) {
                    this.numArrows = value;
                } else {
                    this.elfNumber = value;
                }
            }
    }

    public String toString() {
        return "Elf " + elfNumber + ": " + super.toString() + " имею " + numArrows + " стрел";
    }

    public static void main(String[] args) {
        Elf elf = new Elf("Логоваз", 1, 10);
        System.out.println(elf);
        elf.change("Леголас", 20, 2);
        System.out.println(elf);
        elf.change("Леголас", 30);
        System.out.println(elf);

    }
}