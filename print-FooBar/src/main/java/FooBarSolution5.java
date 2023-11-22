import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * solution of foobar using CyclicBarrier
 */
public class FooBarSolution5 {
    private final int n;

    public FooBarSolution5(int n) {
        this.n = n;
    }

    /**
     * <p>cb.await()会阻塞当前线程，直到cb的计数器为0，然后执行cb的回调函数</p>
     */
    CyclicBarrier cb = new CyclicBarrier(2);
    volatile boolean fin = true;

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (!fin) Thread.onSpinWait();
            printFoo.run();
            fin = false;
            try {
                cb.await();
            } catch (BrokenBarrierException ignored) {
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            try {
                cb.await();
            } catch (BrokenBarrierException ignored) {
            }
            printBar.run();
            fin = true;
        }
    }
}



