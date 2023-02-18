public class Phone {
    private String brand;
    private String model;
    private String color;
    private int storage;
    private double price;
    private boolean is5G;
    private boolean hasCamera;
    private boolean isWaterproof;

    public Phone(String brand, String model, String color, int storage, double price, boolean is5G, boolean hasCamera, boolean isWaterproof) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.storage = storage;
        this.price = price;
        this.is5G = is5G;
        this.hasCamera = hasCamera;
        this.isWaterproof = isWaterproof;
        System.out.println("A new phone of " + brand + " " + model + " has been created.");
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Apple", "iPhone 13", "Graphite", 128, 999.0, true, true, false);
        Phone phone2 = new Phone("Samsung", "Galaxy S21", "Phantom Black", 256, 799.0, true, true, true);
        Phone phone3 = new Phone("OnePlus", "9 Pro", "Morning Mist", 256, 999.0, true, true, true);
    }
}
