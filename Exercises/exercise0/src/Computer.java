public class Computer {

    // Properties
    private int id;
    private String brand;
    private String model;
    private int year;
    private double price;
    private String operatingSystem;
    private int storage;
    private int memory;

    // Constructor
    public Computer(int id, String brand, String model, int year, double price, String operatingSystem, int storage, int memory) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.operatingSystem = operatingSystem;
        this.storage = storage;
        this.memory = memory;
        System.out.println("Created new Computer instance with ID: " + id + ", brand is " + brand + ", model is " + model + ".");
    }

    // Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Main method
    public static void main(String[] args) {
        // Instantiate 3 Computer objects
        Computer comp1 = new Computer(1, "Dell", "XPS 13", 2022, 1499.99, "Windows 11", 512, 16);
        Computer comp2 = new Computer(2, "Apple", "MacBook Air", 2021, 999.99, "macOS Monterey", 256, 8);
        Computer comp3 = new Computer(3, "HP", "Envy x360", 2023, 1299.99, "Windows 11", 1_024, 32);
    }
}

