package ru.brown.chapters.Chapter13_Strings.page424ex4;

/*%[аргумент_индекс$][флаги][ширина][.точность]преобразование*/
public class E04_CustomizableReceipt {
    public static void main(String[] args) {
        Receipt2 receipt = new Receipt2();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
