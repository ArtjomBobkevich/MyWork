package stream;

import java.util.Deque;

public class ConsumerThread extends Thread {

    private Deque<Integer> deque;

    public ConsumerThread(Deque<Integer> deque) {
        this.deque = deque;
    }

    @Override
    public void run() {
        synchronized (deque) {
            while (true) {
                System.out.printf("Consumer %s attempts to get value\n", getName());
                if (deque.size() > 0) {
                    System.out.printf("Consumer %s success. Value %d\n", getName(), deque.removeLast());
                } else {
                    System.out.printf("Consumer %s failed\n", getName());
                }
                System.out.println("Size: " + deque.size());
                try {
                    deque.wait(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}