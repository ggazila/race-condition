package mate.academy.racecondition.threads;

import mate.academy.racecondition.Counter;

public class ThreadImpl extends Thread {
    Counter counter;

    public ThreadImpl(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getIterableVariable() < 100) {
            counter.setIterableVariable(counter.getIterableVariable() + 1);
            System.out.println("thread-2: " + counter.getIterableVariable());
        }
    }
}
