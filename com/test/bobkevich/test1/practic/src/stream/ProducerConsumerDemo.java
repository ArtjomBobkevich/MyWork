package stream;

import java.util.Deque;
import java.util.LinkedList;

public class ProducerConsumerDemo {

    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> deque = new LinkedList<>();
        Thread consumerThread = new ConsumerThread(deque);
        Thread producerThread = new ProduceThread(deque);

        consumerThread.start();
        producerThread.start();

        consumerThread.join();
        producerThread.join();
    }
}
