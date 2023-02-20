package ru.budharain.HW2.Array;


import java.util.Arrays;

public class MyArray<E> implements List<E> {
    private E[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;

    public MyArray() {
        list = (E[]) new Object[DEFAULT_CAPACITY]; // создание с дефолтным
        capacity = DEFAULT_CAPACITY;
    }
    public MyArray(int capacity){
        list = (E[]) new Object[capacity];
        this.capacity = capacity;
    }

//    @Override
//    public void get(int index) {
//        if(index >= size || index >0);
//        System.out.println(list[index]);
//    }
    @Override
    public E get(int index){
     if(index >= size || index >0) throw  new IndexOutOfBoundsException();
         return list[index];
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= capacity) {
            E[] oldList = this.list;
            int newCapacity = (int) (this.capacity * 1.5);
            this.list = (E[]) new Object[newCapacity];
            System.arraycopy(oldList, 0, this.list, 0, minCapacity);
            capacity = newCapacity;
            size = minCapacity - 1;
        }
    }

    @Override
    public void add(E item) {
        ensureCapacity(size);
        list[size] =item;
        size ++;

    }

    @Override
    public void delete(int index) {
        for (int i = index; i < size; i++) {
            list[i] = list[i+1];

        }

    }

    @Override
    public int size() {
        return list.length;
    }


    @Override
    public String toString() {
        return "MyArray{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
