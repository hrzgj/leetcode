package a1115;

import java.util.concurrent.Semaphore;

/**
 * @author: chenyu
 * @date: 2020/11/20 17:15
 */
public class FooBar {
    private int n;
    private final Object lock=new Object();
    private boolean flag=true;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (lock){
                while (!flag){
                    lock.wait();
                }
                printFoo.run();
                flag=false;
                lock.notify();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (lock){
                while (flag){
                    lock.wait();
                }
                printBar.run();
                flag=true;
                lock.notify();
            }
        }
    }
}
