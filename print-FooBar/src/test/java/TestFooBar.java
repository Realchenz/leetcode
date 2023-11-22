import org.junit.Test;

public class TestFooBar {
    @Test
    public void testFooBarSolution() throws InterruptedException {
        FooBarSolution fooBarSolution = new FooBarSolution(10);
        PrintFoo printFoo = new PrintFoo();
        PrintBar printBar = new PrintBar();
        Thread thread1 = new Thread(() -> {
            try {
                fooBarSolution.foo(printFoo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                fooBarSolution.bar(printBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
    @Test
    public void testFooBarSolution1() throws InterruptedException {
        FooBarSolution1 fooBarSolution1 = new FooBarSolution1(10);
        PrintFoo printFoo = new PrintFoo();
        PrintBar printBar = new PrintBar();
        Thread thread1 = new Thread(() -> {
            try {
                fooBarSolution1.foo(printFoo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                fooBarSolution1.bar(printBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
    @Test
    public void testFooBarSolution2() throws InterruptedException {
        FooBarSolution2 fooBarSolution2 = new FooBarSolution2(10);
        PrintFoo printFoo = new PrintFoo();
        PrintBar printBar = new PrintBar();
        Thread thread1 = new Thread(() -> {
            try {
                fooBarSolution2.foo(printFoo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                fooBarSolution2.bar(printBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
    @Test
    public void testFooBarSolution3() throws InterruptedException {
        FooBarSolution3 fooBarSolution3 = new FooBarSolution3(10);
        PrintFoo printFoo = new PrintFoo();
        PrintBar printBar = new PrintBar();
        Thread thread1 = new Thread(() -> {
            try {
                fooBarSolution3.foo(printFoo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                fooBarSolution3.bar(printBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
    @Test
    public void testFooBarSolution4() throws InterruptedException {
        FooBarSolution4 fooBarSolution4 = new FooBarSolution4(10);
        PrintFoo printFoo = new PrintFoo();
        PrintBar printBar = new PrintBar();
        Thread thread1 = new Thread(() -> {
            try {
                fooBarSolution4.foo(printFoo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                fooBarSolution4.bar(printBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
    @Test
    public void testFooBarSolution5() throws InterruptedException {
        FooBarSolution5 fooBarSolution5 = new FooBarSolution5(10);
        PrintFoo printFoo = new PrintFoo();
        PrintBar printBar = new PrintBar();
        Thread thread1 = new Thread(() -> {
            try {
                fooBarSolution5.foo(printFoo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                fooBarSolution5.bar(printBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    private static class PrintBar implements Runnable {
        @Override
        public void run() {
            System.out.println("bar");
        }
    }
    private static class PrintFoo implements Runnable {
        @Override
        public void run() {
            System.out.print("foo");
        }
    }
}