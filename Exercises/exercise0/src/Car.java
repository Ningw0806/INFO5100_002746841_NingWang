public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private String color;
    private boolean isAutomatic;
    private boolean isFourWheelDrive;
    private double price;

    public Car(String make, String model, int year, int mileage, String color, boolean isAutomatic, boolean isFourWheelDrive, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.isFourWheelDrive = isFourWheelDrive;
        this.price = price;
        System.out.println("New car instance created with make " + make + " and model " + model);
    }

    public void drive() {
        System.out.println("The car is driving");
    }

    public void stop() {
        System.out.println("The car has stopped");
    }

    public void honk() {
        System.out.println("The car is honking");
    }

    public class Engine {
        private int cylinders;
        private double horsepower;
        private String fuelType;

        public Engine(int cylinders, double horsepower, String fuelType) {
            this.cylinders = cylinders;
            this.horsepower = horsepower;
            this.fuelType = fuelType;
            System.out.println("New engine instance created with " + cylinders + " cylinders and " + horsepower + " horsepower");
        }

        public void start() {
            System.out.println("The engine has started");
        }

        public void stop() {
            System.out.println("The engine has stopped");
        }

        public void rev() {
            System.out.println("The engine is revving");
        }
    }

    public class Radio {
        private boolean hasBluetooth;
        private boolean hasAuxInput;
        private boolean hasAMRadio;
        private boolean hasFMRadio;
        private int volume;

        public Radio(boolean hasBluetooth, boolean hasAuxInput, boolean hasAMRadio, boolean hasFMRadio, int volume) {
            this.hasBluetooth = hasBluetooth;
            this.hasAuxInput = hasAuxInput;
            this.hasAMRadio = hasAMRadio;
            this.hasFMRadio = hasFMRadio;
            this.volume = volume;
            System.out.println("New radio instance created with volume " + volume);
        }

        public void play() {
            System.out.println("The radio is playing");
        }

        public void pause() {
            System.out.println("The radio is paused");
        }

        public void changeStation() {
            System.out.println("The radio station has been changed");
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2021, 10000, "Blue", true, false, 20000.0);
        Car car2 = new Car("Honda", "Accord", 2020, 20000, "Red", true, false, 25000.0);
        Car car3 = new Car("Ford", "Mustang", 2019, 30000, "Black", true, true, 35000.0);

        Engine engine1 = car1.new Engine(4, 150.0, "Gasoline");
        Engine engine2 = car2.new Engine(6, 200.0, "Gasoline");
        Engine engine3 = car3.new Engine(8, 300.0, "Gasoline");

        Radio radio1 = car1.new Radio(true, true, true, false, 5);
        Radio radio2 = car2.new Radio(false, true, true, true, 10);
        Radio radio3 = car3.new Radio(false, true, false, true, 7);

        car1.drive();
        car2.stop();
        car3.honk();

        engine1.start();
        engine2.rev();
        engine3.stop();

        radio1.play();
        radio2.pause();
        radio3.changeStation();
    }
}

