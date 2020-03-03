package mate.academy.racecondition.threads;

import mate.academy.racecondition.Counter;

public class ThreadImpl extends Thread {
    private static final int FINAL_CONDITION = 100;
    private Counter counter;

    public ThreadImpl(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getIterableVariable() < FINAL_CONDITION) {
            counter.increment();
            System.out.println("thread-2: " + counter.getIterableVariable());
        }
    }
}
