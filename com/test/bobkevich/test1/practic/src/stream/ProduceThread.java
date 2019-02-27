package stream;

import java.util.Deque;

public class ProduceThread extends Thread {

    public static final int THRESHOLD = 10;
    private Deque<Integer> deque;

    public ProduceThread(Deque<Integer> deque) {
        this.deque = deque;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (deque) {
                System.out.printf("Producer + %s attempts to add value\n", getName());
                if (deque.size() < THRESHOLD) {
                    deque.add(RandomUtil.next());
                    System.out.printf("Producer + %s success. Value %d\n", getName(), deque.getLast());
                } else {
                    System.out.printf("Producer + %s failed\n", getName());
                }
                System.out.println("Size: " + deque.size());
            }
            try {
                Thread.sleep(110);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}