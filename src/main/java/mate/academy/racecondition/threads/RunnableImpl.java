package mate.academy.racecondition.threads;

import mate.academy.racecondition.Counter;

public class RunnableImpl implements Runnable {
    Counter counter;

    public RunnableImpl(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getIterableVariable() < 100) {
            counter.setIterableVariable(counter.getIterableVariable() + 1);
            System.out.println("thread-1: " + counter.getIterableVariable());
        }
    }
}
