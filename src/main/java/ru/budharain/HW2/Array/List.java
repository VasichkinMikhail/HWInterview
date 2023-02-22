package ru.budharain.HW2.Array;

public interface List <E>{
//    void get(int index); //метод для возвращения значение в консоль
    E get(int index); //метод возвращает элемент

    void add(E item);

    void delete(int index);

    int size();

}
