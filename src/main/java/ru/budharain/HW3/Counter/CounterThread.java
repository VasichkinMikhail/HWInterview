package ru.budharain.HW3.Counter;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterThread{
    public static void main(String[] args){
        Lock lock = new ReentrantLock();
        Counter counter = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    boolean locked = false;
                    try {
                        locked =lock.tryLock(200, TimeUnit.MILLISECONDS);
                        if(locked){
                            counter.inc();
                            System.out.println(counter.getCount());
                            lock.unlock();
                            try {
                                Thread.sleep(200);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    boolean locked = false;
                    try {
                        locked =lock.tryLock(200, TimeUnit.MILLISECONDS);
                        if(locked){
                            counter.dec();
                            System.out.println(counter.getCount());
                            lock.unlock();
                            try {
                                Thread.sleep(200);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
