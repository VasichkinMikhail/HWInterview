package ru.budharain;

import ru.budharain.HW2.Array.MyArray;
import ru.budharain.HW2.LinkedList.LinkList;

public class Main {
    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(3);
        myArray.add(3);
        myArray.add(3);
        myArray.add(3);
        myArray.add(3);
        myArray.add(3);
        myArray.add(3);
        myArray.add(3);

        System.out.println(myArray.toString());
//        LinkList list = new LinkList();
//        list.addFirst(2);
//        list.addFirst(5);
//        list.addLast(6);
//        list.print();
//
//        System.out.println();
//        list.deleteAt(2);
//        list.print();


    }
}