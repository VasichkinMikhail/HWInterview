package ru.budharain.HW1.polymorf;

public class MainFigure {
    public static void main(String[] args) {
        Figure figure = new Figure();
        figure.area();
        figure.area(10);
        figure.area(5,6,3);
        figure.area(5.0);
    }
}
