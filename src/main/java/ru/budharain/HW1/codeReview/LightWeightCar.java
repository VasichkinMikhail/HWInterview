package ru.budharain.HW1.codeReview;

import ru.budharain.HW1.codeReview.interfaces.Move;
import ru.budharain.HW1.codeReview.interfaces.Open;

public class LightWeightCar extends Car {

        @Override
    public void move() {
        System.out.println("Car is move");
    }

    @Override
    public void open() {
        System.out.println("Car is open");
    }
}
