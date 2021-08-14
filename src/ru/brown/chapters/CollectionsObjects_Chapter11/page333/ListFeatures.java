package ru.brown.chapters.CollectionsObjects_Chapter11.page333;

import ru.brown.chapters.util.Print;

import java.util.*;

import static ru.brown.chapters.util.Print.print;

public class ListFeatures {

    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = new ArrayList<Pet>(Arrays.<Pet>asList(
                new Rat(),
                new Manx(),
                new Cymric(),
                new Mutt(),
                new Pug(),
                new Cymric(),
                new Pug()));
        print("1: " + pets); /* [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]*/

        Hamster h = new Hamster();
        // С автоматическим изменением размера
        pets.add(h);
        print("2: " + pets); /* [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster] */
        print("3: " + pets.contains(h)); /*true*/

        // Удаление заданного объекта
        pets.remove(h);

        Pet p = pets.get(2);
        print("4: " + p + " " + pets.indexOf(p));/*4: Cymric 2*/

        Pet cymric = new Cymric();
        print("5: " + pets.indexOf(cymric));/*5: -1 */

        // Удаление заданного объекта:
        print("6: " + pets.remove(cymric)); /*6: false */
        print("7: " + pets.remove(p));/*7: true*/
        print("8: " + pets);/*8: [Rat, Manx, Mutt, Pug, Cymric, Pug]*/

        // Вставка по индексу
        pets.add(3, new Mouse());
        print("9: " + pets);/*9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug] */
        List<Pet> sub = pets.subList(1, 4);
        print("Частичный список: " + sub);/*Частичный список: [Manx, Mutt, Mouse]*/
        print("10: " + pets.containsAll(sub));/*10: true*/

        // Сортировка "на месте"
        Collections.sort(sub);
        print("Полсле сортировки: " + sub);/*После сортировки: [Manx, Mouse, Mutt)*/

        // Для containsAll() порядок не важен:
        print("11: " + pets.containsAll(sub)); /*11: true*/

        // Перемешивание
        Collections.shuffle(sub, rand);
        print("Пoслe перемешивания: " + sub);/*После перемешивания: [Mouse, Manx, Mutt]*/
        print("12: " + pets.containsAll(sub));/*12: true*/
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        print("sub: " + sub); /*sub: [Mouse, Pug]*/
        copy.retainAll(sub);
        print("13: " + copy);/*13: [Mouse, Pug]*/

        // Копирование
        copy = new ArrayList<Pet>(pets);

        // Удаление по индексу
        copy.remove(2);
        print("14: " + copy); /*14: [Rat, Mouse, Mutt, Pug, Cymric, Pug] || Cymric removed*/

        // Удаление заданных объектов
        copy.removeAll(sub);
        print("15: " + copy); /*15: [Rat, Mutt, Cymric, Pug] || Удалил по 1 [Mouse, Pug], которые были в sub коллекции*/

        // Замена элемента
        copy.set(1, new Mouse());
        print("16: " + copy);/*16: [Rat, Mouse, Cymric, Pug] || Заменили Mutt на Mouse*/

        // Вставка списка в середину
        copy.addAll(2, sub);
        print("17: " + copy); /*17: [Rat, Mouse, Mouse, Pug, Cymric, Pug] || Вставили элементы с индексом 2 и 3 из другого массива. Элементы изменяемого массива сдвинулись вправо*/
        print("18: " + pets.isEmpty());/*18: false */

        // Удаление всех элементов
        pets.clear();
        print("19: " + pets);/*19: []*/
        print("20: " + pets.isEmpty());/*20: true*/

        pets = new ArrayList<Pet>(Arrays.<Pet>asList(
                new Manx(),
                new Cymric(),
                new Rat(),
                new EgyptianMau()));
        print("21: "+ pets);/*21: [Manx, Cymric, Rat, EgyptianMau]*/
        //Не понятно почему тут выводится египетский мау
        Object[] o = pets.toArray(new Pet[0]);
        print("22: "+ o[3]);/*22: EgyptianMau */
        Pet[] pa = pets.toArray(new Pet[0]);
        print("23: " + pa[3].id());/*23: 14*/

    }
}