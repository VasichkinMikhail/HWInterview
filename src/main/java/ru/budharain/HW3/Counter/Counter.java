package ru.budharain.HW3.Counter;


public class Counter{
    private int count;

    public Counter() {
    }
    public void inc(){
        count++;
    }
    public void dec(){
        count--;
    }

    public int getCount() {
        return count;
    }
}

