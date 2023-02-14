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

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    static class Battery {
        private String type;
        private int capacity;
        private boolean isRemovable;

        public Battery(String type, int capacity, boolean isRemovable) {
            this.type = type;
            this.capacity = capacity;
            this.isRemovable = isRemovable;
            System.out.println("A new battery of type " + type + " has been created.");
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }

        public boolean isRemovable() {
            return isRemovable;
        }
    }

    static class Display {
        private double size;
        private int resolution;
        private boolean isTouchscreen;

        public Display(double size, int resolution, boolean isTouchscreen) {
            this.size = size;
            this.resolution = resolution;
            this.isTouchscreen = isTouchscreen;
            System.out.println("A new display with resolution " + resolution + " has been created.");
        }

        public double getSize() {
            return size;
        }

        public int getResolution() {
            return resolution;
        }

        public boolean isTouchscreen() {
            return isTouchscreen;
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Apple", "iPhone 13", "Graphite", 128, 999.0, true, true, false);
        Phone phone2 = new Phone("Samsung", "Galaxy S21", "Phantom Black", 256, 799.0, true, true, true);
        Phone phone3 = new Phone("OnePlus", "9 Pro", "Morning Mist", 256, 999.0, true, true, true);

        Phone.Battery battery1 = new Phone.Battery("Li-Po", 4000, false);
        Phone.Battery battery2 = new Phone.Battery("Li-Po", 4800, true);
        Phone.Battery battery3 = new Phone.Battery("Li-Ion", 4500, true);

        Phone.Display display1 = new Phone.Display(6.1, 2532, true);
        Phone.Display display2 = new Phone.Display(6.2, 2400, true);
        Phone.Display display3 = new Phone.Display(6.7, 3216, true);
    }
}
