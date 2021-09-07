package ru.brown.chapters.CollectionsObjects_Chapter11.page353ex28priorityqueue;

/*Заполните контейнер PriorityQueue(с использованием метода offer())значениями Double,
созданными генератором java.util.Random.
Извлеките элементы из очереди методом poll() и выведите их.
*/

import ru.brown.chapters.CollectionsObjects_Chapter11.page353ex29.Flee;
import ru.brown.chapters.util.Print;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Ex28_PriorityQueue {
    PriorityQueue<Double> priorityQueue = new PriorityQueue<>();

    public PriorityQueue<Double> filler(PriorityQueue pq) {
        Random random = new Random();
        for (int i = 0; i<10; i++){
            double randomValue = ThreadLocalRandom.current().nextDouble(1.0, 50.0);
            pq.offer(randomValue);
        }
        return priorityQueue;
    }

    public void extractor (PriorityQueue<Double> pq) {
        while (pq.peek()!=null) {
            Print.print(pq.poll());
        }
    }

    public static void main(String[] args) {
        Ex28_PriorityQueue demo = new Ex28_PriorityQueue();
        PriorityQueue<Double> pq = new PriorityQueue<>();
        demo.filler(pq);
        demo.extractor(pq);

//        Flee flee = new Flee("1");
//        Flee flee2 = new Flee("2");
//        PriorityQueue<Flee> flees = new PriorityQueue<>();
//        flees.offer(flee);
//        flees.offer(flee2);
    }
}