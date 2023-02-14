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
        System.out.println("Created new Computer instance with ID: " + id);
    }

    // Methods
    public void powerOn() {
        System.out.println("Computer is powering on...");
    }

    public void installSoftware(String softwareName) {
        System.out.println("Installing " + softwareName + "...");
    }

    public void upgradeMemory(int additionalMemory) {
        this.memory += additionalMemory;
        System.out.println("Upgraded memory to " + this.memory + " GB");
    }

    // Nested class
    public static class Keyboard {

        // Properties
        private int id;
        private String brand;
        private String model;
        private String layout;
        private boolean backlit;
        private boolean wireless;
        private boolean numericKeypad;
        private double price;

        // Constructor
        public Keyboard(int id, String brand, String model, String layout, boolean backlit, boolean wireless, boolean numericKeypad, double price) {
            this.id = id;
            this.brand = brand;
            this.model = model;
            this.layout = layout;
            this.backlit = backlit;
            this.wireless = wireless;
            this.numericKeypad = numericKeypad;
            this.price = price;
            System.out.println("Created new Keyboard instance with ID: " + id);
        }

        // Methods
        public void pressKey(String key) {
            System.out.println("Pressed " + key);
        }

        public void changeLayout(String newLayout) {
            this.layout = newLayout;
            System.out.println("Changed layout to " + this.layout);
        }

        public void toggleBacklit() {
            this.backlit = !this.backlit;
            System.out.println("Backlit is now " + (this.backlit ? "on" : "off"));
        }
    }

    // Another nested class
    public static class Monitor {

        // Properties
        private int id;
        private String brand;
        private String model;
        private int size;
        private String resolution;
        private boolean curved;
        private int refreshRate;
        private double price;

        // Constructor
        public Monitor(int id, String brand, String model, int size, String resolution, boolean curved, int refreshRate, double price) {
            this.id = id;
            this.brand = brand;
            this.model = model;
            this.size = size;
            this.resolution = resolution;
            this.curved = curved;
            this.refreshRate = refreshRate;
            this.price = price;
            System.out.println("Created new Monitor instance with ID: " + id);
        }

        // Methods
        public void displayImage(String imagePath) {
            System.out.println("Displaying image " + imagePath);
        }

        public void adjustBrightness(int level) {
            System.out.println("Adjusted brightness to " + level);
        }

        public void toggleCurved() {
            this.curved = !this.curved;
            System.out.println("Curved is now " + (this.curved ? "on" : "off"));
        }
    }

    // Main method
    public static void main(String[] args) {

        // Instantiate 3 Computer objects
        Computer comp1 = new Computer(1, "Dell", "XPS 13", 2022, 1499.99, "Windows 11", 512, 16);
        Computer comp2 = new Computer(2, "Apple", "MacBook Air", 2021, 999.99, "macOS Monterey", 256, 8);
        Computer comp3 = new Computer(3, "HP", "Envy x360", 2023, 1299.99, "Windows 11", 1_024, 32);

        // Instantiate 3 Keyboard objects for comp1
        Computer.Keyboard kb1 = new Computer.Keyboard(1, "Logitech", "K840", "QWERTY", false, false, true, 79.99);
        Computer.Keyboard kb2 = new Computer.Keyboard(2, "Corsair", "K95 RGB Platinum XT", "AZERTY", true, false, true, 199.99);
        Computer.Keyboard kb3 = new Computer.Keyboard(3, "Razer", "BlackWidow V3 Pro", "QWERTZ", true, true, true, 229.99);

        // Instantiate 3 Monitor objects for comp2
        Computer.Monitor mon1 = new Computer.Monitor(1, "LG", "27GN950-B", 27, "3840x2160", true, 144, 1099.99);
        Computer.Monitor mon2 = new Computer.Monitor(2, "Dell", "S2721QS", 27, "3840x2160", false, 60, 319.99);
        Computer.Monitor mon3 = new Computer.Monitor(3, "ASUS", "VG249Q", 24, "1920x1080", false, 144, 199.99);
    }
}

