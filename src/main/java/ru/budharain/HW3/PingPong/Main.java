package ru.budharain.HW3.PingPong;


import ru.budharain.HW3.PingPong.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setState("ping");
        myThread.start();
        MyThread myThread2 = new MyThread();
        myThread2.setState("pong");
        myThread2.start();

    }
}