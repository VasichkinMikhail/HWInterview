package ru.budharain.HW1.codeReview;

abstract class Car {
    private Engine engine;
    private String color;
    private String name;

    public void move() {
        System.out.println("Car is move");
    }

    public void stop() {
        System.out.println("Car is stop");
    }

    public void start() {
        System.out.println("Car is start");
    }

    public void open() {
        System.out.println("Car is open");
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}



