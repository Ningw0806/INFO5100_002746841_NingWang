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
        System.out.println("New car instance created with make " + make + " and model is " + model + ".");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2021, 10000, "Blue", true, false, 20000.0);
        Car car2 = new Car("Honda", "Accord", 2020, 20000, "Red", true, false, 25000.0);
        Car car3 = new Car("Ford", "Mustang", 2019, 30000, "Black", true, true, 35000.0);
    }
}

