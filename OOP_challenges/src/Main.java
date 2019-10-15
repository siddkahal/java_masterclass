public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

//        Printer printer = new Printer(50, true);
//        System.out.println("initial page count = " + printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
//
//        Car car = new Car(8, "Base car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.carBreak());
//
//
//        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.carBreak());
//
//        Ford Ford = new Ford(6, "Explorer");
//        System.out.println(Ford.startEngine());
//        System.out.println(Ford.accelerate());
//        System.out.println(Ford.carBreak());

        Hamburger h = new Hamburger("Basic ", "Sausage", 3.56, "White");
        h.addHamburgerAddition1("pepper jack cheese", 0.75);
        double h_price = h.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total healthy burger price: " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("tomatoe", .30);

    }


}

class Car {
    private boolean enginer;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.enginer = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEnginer()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String carBreak() {
        return "Car -> break()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEnginer()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String carBreak() {
        return "Mitsubishi -> break()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEnginer()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String carBreak() {
        return "Ford -> break()";
    }
}


