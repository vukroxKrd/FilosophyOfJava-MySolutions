package ru.brown.chapters.CollectionsObjects_Chapter11.page350queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
    public static void printQ(Queue queue) {
        /*Методы peek() и element() возвращают элемент в начале очереди без его извлечения, но
        peek() возвращает null для пустой очереди, а
        element() выдает исключение NoSuchElementException.*/
        while (queue.peek() != null)
            /* Методы poll() и remove() извлекают и возвращают элемент в начале очереди, но
            - poll() возвращает null для пустой очереди, а
            - remove() выдает NoSuchElementException.
            */
            System.out.print(queue.remove() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
            /*offer() вставляет элемент в конец очереди или возвращает false.*/
            queue.offer(rand.nextInt(i + 10));
        printQ(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray())
            qc.offer(c);
        printQ(qc);
    }
}