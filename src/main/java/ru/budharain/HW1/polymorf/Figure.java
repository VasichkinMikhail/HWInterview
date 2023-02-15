package ru.budharain.HW1.polymorf;
//Сделал перегрузку метода
public class Figure {
    public void area(){

        System.out.println("Площади фигур");
    }
    public void area(int radius) {
        double s =  (Math.PI * (radius^2));
        System.out.println("Площадь круга - "+s);
    }
    public void area(int a,int b,int c ) {
        double p = (a + b + c)/2;
        double s = Math.sqrt(p * (p-a)*(p-b)*(p-c));
        System.out.println("Площадь треугольника - "+s);
    }
    public void area(double a) {
        double s = a * a;
        System.out.println("Площадь квадрата - "+s);
    }
}

