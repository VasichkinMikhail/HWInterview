package ru.budharain.HW3.PingPong;

public class MyThread extends Thread {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(state);
        }
    }
}

