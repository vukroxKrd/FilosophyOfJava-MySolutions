package ru.brown.chapters.CollectionsObjects_Chapter11.page336ex5_ArrayListFeatures;

import ru.brown.chapters.CollectionsObjects_Chapter11.page333.*;

import java.util.*;

import static ru.brown.chapters.util.Print.print;

public class ListFeatures {

    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> numbers = new ArrayList<Integer>(Arrays.<Integer>asList(1,2,3,4,5,6,7,8,9));
        print("1: " + numbers); /* [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]*/

        Integer ten = new Integer(10);
        // С автоматическим изменением размера
        numbers.add(ten);
        print("2: " + numbers); /* [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster] */
        print("3: " + numbers.contains(ten)); /*true*/

        // Удаление заданного объекта
        numbers.remove(ten);

        Integer p = numbers.get(2);
        print("4: " + p + " " + numbers.indexOf(p));/*4: Cymric 2*/

        Pet cymric = new Cymric();
        print("5: " + numbers.indexOf(cymric));/*5: -1 */

        // Удаление заданного объекта:
        print("6: " + numbers.remove(cymric)); /*6: false */
        print("7: " + numbers.remove(p));/*7: true*/
        print("8: " + numbers);/*8: [Rat, Manx, Mutt, Pug, Cymric, Pug]*/

        // Вставка по индексу
        numbers.add(3, new Integer(11));
        print("9: " + numbers);/*9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug] */
        List<Integer> sub = numbers.subList(1, 4);
        print("Частичный список: " + sub);/*Частичный список: [Manx, Mutt, Mouse]*/
        print("10: " + numbers.containsAll(sub));/*10: true*/

        // Сортировка "на месте"
        Collections.sort(sub);
        print("Полсле сортировки: " + sub);/*После сортировки: [Manx, Mouse, Mutt)*/

        // Для containsAll() порядок не важен:
        print("11: " + numbers.containsAll(sub)); /*11: true*/

        // Перемешивание
        Collections.shuffle(sub, rand);
        print("Пoслe перемешивания: " + sub);/*После перемешивания: [Mouse, Manx, Mutt]*/
        print("12: " + numbers.containsAll(sub));/*12: true*/
        List<Integer> copy = new ArrayList<Integer>(numbers);
        sub = Arrays.asList(numbers.get(1), numbers.get(4));
        print("sub: " + sub); /*sub: [Mouse, Pug]*/
        copy.retainAll(sub);
        print("13: " + copy);/*13: [Mouse, Pug]*/

        // Копирование
        copy = new ArrayList<Integer>(numbers);

        // Удаление по индексу
        copy.remove(2);
        print("14: " + copy); /*14: [Rat, Mouse, Mutt, Pug, Cymric, Pug] || Cymric removed*/

        // Удаление заданных объектов
        copy.removeAll(sub);
        print("15: " + copy); /*15: [Rat, Mutt, Cymric, Pug] || Удалил по 1 [Mouse, Pug], которые были в sub коллекции*/

        // Замена элемента
        copy.set(1, new Integer(12));
        print("16: " + copy);/*16: [Rat, Mouse, Cymric, Pug] || Заменили Mutt на Mouse*/

        // Вставка списка в середину
        copy.addAll(2, sub);
        print("17: " + copy); /*17: [Rat, Mouse, Mouse, Pug, Cymric, Pug] || Вставили элементы с индексом 2 и 3 из другого массива. Элементы изменяемого массива сдвинулись вправо*/
        print("18: " + numbers.isEmpty());/*18: false */

        // Удаление всех элементов
        numbers.clear();
        print("19: " + numbers);/*19: []*/
        print("20: " + numbers.isEmpty());/*20: true*/

        numbers = new ArrayList<Integer>(Arrays.<Integer>asList(1,2,3,4,5));
        print("21: "+ numbers);/*21: [Manx, Cymric, Rat, EgyptianMau]*/
        //Не понятно почему тут выводится египетский мау
        Object[] o = numbers.toArray(new Integer[0]);
        print("22: "+ o[3]);/*22: EgyptianMau */
        Integer[] pa = numbers.toArray(new Integer[0]);
        print("23: " + pa[3]);/*23: 14*/

    }
}
