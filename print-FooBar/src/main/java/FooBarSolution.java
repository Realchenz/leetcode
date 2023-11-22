import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * Solution of FooBar problem using BlockingQueue.
 */
public class FooBarSolution {
    /**
     * n means the times to print "foo" and "bar" alternately.
     */
    private final int n;
    private BlockingQueue<Integer> bar = new LinkedBlockingQueue<>(1);
    private BlockingQueue<Integer> foo = new LinkedBlockingQueue<>(1);

    public FooBarSolution(int n) {
        this.n = n;
    }

    /**
     * The same instance of FooBar will be passed to two different threads.
     * @param printFoo The printFoo() method will be invoked first and you may output "foo".
     * @throws InterruptedException if any thread has interrupted the current thread.
     */
    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            foo.put(i); // put() will block if the queue is full
            printFoo.run();
            bar.put(i);
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            bar.take();
            printBar.run();
            foo.take();
        }
    }
}
