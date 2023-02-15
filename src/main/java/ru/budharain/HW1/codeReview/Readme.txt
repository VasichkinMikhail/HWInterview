   //  Так как движение и остановка вынесены в отдельные интерфейсы, а старт и опен находятся в абстрактном классе, было бы проще реализовать тогда
   всё в интерфейсы. Либо всё в абстрактном Car. В решении я сделал и то и то. Не совсем понятно что за классы LightWeight, особенно Lorry. Не хватает класса Engine. Если это сборщик авто то не хватает билдера
   или конструктора на худой конец. И создание по итогу машины тоже нет только абстракция. Я понимаю что не в этом была задача, но честно чем дальше лез тем больше менял).
   Поэтому остановился так как закопался дальше не куда). Еще разнес по отдельным классам. Когда все в кучу прям бе. Надеюсь не сильно задушнил))).

   interface Moveable {
        void move();
    }
    interface Stopable {
        void stop();
    }

    abstract class Car {
        public Engine engine; //нужен класс
        private String color;
        private String name;

        protected void start() { // либо вынести в интерфейс, либо добавить методы из интерфейсов в абстрактный класс.
            System.out.println("Car starting");
        }
        abstract void open();
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
    class LightWeightCar extends Car implements Moveable {
        @Override
        void open() {                             //public
            System.out.println("Car is open");
        }
        @Override
        public void move() {
            System.out.println("Car is moving");
        }
    }

    class Lorry extends Car, Moveable, Stopable { // Правильно будет class Lorry extends Car implements Moveable, Stopable не возможно множественное наследование в Java да и интерфейсы имплиментятся а не наследуются.
        public void move(){
            System.out.println("Car is moving");
        }
        public void stop(){
            System.out.println("Car is stop");
        }
    }
