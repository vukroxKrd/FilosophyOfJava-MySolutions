package ru.brown.chapters.CollectionsObjects_Chapter11.page340_LinkedListFeatures;
import ru.brown.chapters.CollectionsObjects_Chapter11.page333.*;
import static ru.brown.chapters.util.Print.print;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;


public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Arrays.asList(
                new Rat(),
                new Manx(),
                new Cymric(),
                new Mutt(),
                new Pug(),
                new Cymric(),
                new Pug()));

        print(pets);
        LinkedList<Pet> emptyPets = new LinkedList<>();
        // Идентично:
        print("pets.getFirst()): " + pets.getFirst());
        print("pets.element(): " + pets.element());
        // print(emptyPets.element());
        // Отличается только поведение для пустого списка:
        print("pets.peek(): " + pets.peek());
        print(emptyPets.peek());
        print(pets);
        // Идентично; удаление и возвращение первого элемента:
        print("pets.remove(): " + pets.remove());
        print("pets.removeFirst(): " + pets.removeFirst());
        print(pets);
        // Отличается только поведение для пустого списка:
        print("pets.poll(): " + pets.poll());

        print(emptyPets.poll());
        try {
            print(emptyPets.remove());
        } catch (NoSuchElementException e) {
            print(e.getCause());
        }
        try {
            print(emptyPets.removeFirst());
        } catch (NoSuchElementException e) {
            print(e.getCause());
        }

        print(pets);
        pets.addFirst(new Rat());
        print("После addFirst():" + pets);
        //offer() - adds the specified element as the tail (last element) of this list.
        pets.offer(new Pug());
        print("После offer(): " + pets);
        pets.add(new Rat());

        print("Пocлe add(): " + pets);
        pets.addLast(new Hamster());
        print("Пocлe addLast(): " + pets);
        print("pets.removeLast(): " + pets.removeLast());
        print(pets);

    }
}