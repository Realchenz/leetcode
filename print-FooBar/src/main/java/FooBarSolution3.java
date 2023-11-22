/**
 * 通过synchronized和wait/notifyAll实现
 */
public class FooBarSolution3 {
    private final int n;
    private Object obj = new Object();
    private volatile boolean fooExec = true;

    public FooBarSolution3(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (obj) {
                if (!fooExec) {//fooExec为false时，该线程等待，为true的时候执行下面的操作
                    obj.wait();
                }
                printFoo.run();
                fooExec = false;
                obj.notifyAll();//唤醒其他线程
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (obj) {
                if (fooExec) {
                    obj.wait();
                }
                printBar.run();
                fooExec = true;
                obj.notifyAll();
            }

        }
    }
}