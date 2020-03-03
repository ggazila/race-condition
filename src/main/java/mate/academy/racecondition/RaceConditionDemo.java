package mate.academy.racecondition;

import mate.academy.racecondition.threads.RunnableImpl;
import mate.academy.racecondition.threads.ThreadImpl;

public class RaceConditionDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread threadImpl = new ThreadImpl(counter);
        Thread runnableImpl = new Thread(new RunnableImpl(counter));
        threadImpl.start();
        runnableImpl.start();
    }
}
