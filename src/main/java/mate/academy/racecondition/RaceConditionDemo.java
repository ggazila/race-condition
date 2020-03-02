package mate.academy.racecondition;

import mate.academy.racecondition.threads.RunnableImpl;
import mate.academy.racecondition.threads.ThreadImpl;

public class RaceConditionDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadImpl threadImpl = new ThreadImpl(counter);
        RunnableImpl runnableImpl = new RunnableImpl(counter);
        threadImpl.start();
        runnableImpl.run();
    }
}
