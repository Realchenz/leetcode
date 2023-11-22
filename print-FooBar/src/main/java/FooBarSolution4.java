import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.LockSupport;

/**
 * solution of foobar using locksupport
 */
public class FooBarSolution4 {
    private final int n;
    private Map<String, Thread> map = new ConcurrentHashMap<>();
    private volatile boolean fooExec = true;

    public FooBarSolution4(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        map.put("foo", Thread.currentThread());
        for (int i = 0; i < n; i++) {
            while (!fooExec) {
                LockSupport.park();
            }
            printFoo.run();
            fooExec = false;
            LockSupport.unpark(map.get("bar"));
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        map.put("bar", Thread.currentThread());
        for (int i = 0; i < n; i++) {
            while (fooExec) {
                LockSupport.park();
            }
            printBar.run();
            fooExec = true;
            LockSupport.unpark(map.get("foo"));
        }
    }
}

