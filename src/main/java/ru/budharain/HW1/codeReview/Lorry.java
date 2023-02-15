package ru.budharain.HW1.codeReview;

import ru.budharain.HW1.codeReview.interfaces.Move;
import ru.budharain.HW1.codeReview.interfaces.Stop;

public class Lorry extends Car implements Move, Stop {


    @Override
    public void move() {
        System.out.println("Car is move");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }
}
