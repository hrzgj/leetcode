package a1114;

/**
 * @author: chenyu
 * @date: 2020/11/20 17:06
 */
public class Foo {
    volatile int i;
    public Foo() {
        i=0;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        if(i==0) {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            i++;
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        if(i==1) {
            printSecond.run();
            i++;
        }else {
            while (true){
                if(i==1){
                    printSecond.run();
                    i++;
                    break;
                }
            }
        }
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        if(i==2) {
            printThird.run();
            i++;
        }else {
            while (true){
                if(i==2){
                    printThird.run();
                    i++;
                    break;
                }
            }
        }
    }
}
