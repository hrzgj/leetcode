package a1195;

import java.util.function.IntConsumer;

/**
 * @author: chenyu
 * @date: 2020/11/20 20:34
 */
public class FizzBuzz {
    private int n;
    private volatile int num=1;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (num<=n){
            synchronized (this){
                if(num<=n&&num%3==0&&num%5!=0){
                    printFizz.run();
                    num++;
                }
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (num<=n){
            synchronized (this){
                if(num<=n&&num%5==0&&num%3!=0){
                    printBuzz.run();
                    num++;
                }
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (num<=n){
            synchronized (this){
                if(num<=n&&num%3==0&&num%5==0){
                    printFizzBuzz.run();
                    num++;
                }
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (num<=n){
            synchronized (this){
                if(num<=n&&num%3!=0&&num%5!=0){
                    printNumber.accept(num);
                    num++;
                }
            }
        }
    }
}
