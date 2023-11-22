import java.util.concurrent.locks.ReentrantLock;
/**
 * Solution of FooBar problem using ReentrantLock.
 */
public class FooBarSolution2 {
    private final int n;
    /**
     * <p>true: fair lock</p>
     * false: unfair lock
     */
    private ReentrantLock lock = new ReentrantLock(false);
    volatile boolean fooExec = true;

    public FooBarSolution2(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; ) {
            lock.lock();
            try {
                if (fooExec) {
                    printFoo.run();
                    fooExec = false;
                    i++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; ) {
            lock.lock();
            try {
                if (!fooExec) {
                    printBar.run();
                    fooExec = true;
                    i++;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
