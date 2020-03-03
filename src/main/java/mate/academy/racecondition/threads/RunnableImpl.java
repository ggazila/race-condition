package mate.academy.racecondition.threads;

import mate.academy.racecondition.Counter;

public class RunnableImpl implements Runnable {
    private static final int FINAL_CONDITION = 100;
    private Counter counter;

    public RunnableImpl(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getIterableVariable() < FINAL_CONDITION) {
            counter.increment();
            System.out.println("thread-1: " + counter.getIterableVariable());
        }
    }
}
