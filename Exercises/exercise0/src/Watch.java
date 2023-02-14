public class Watch {
    private String brand;
    private String model;
    private int caseSize;
    private String caseMaterial;
    private String bandMaterial;
    private String movementType;
    private int waterResistance;
    private boolean hasChronograph;

    public Watch(String brand, String model, int caseSize, String caseMaterial, String bandMaterial, String movementType, int waterResistance, boolean hasChronograph) {
        this.brand = brand;
        this.model = model;
        this.caseSize = caseSize;
        this.caseMaterial = caseMaterial;
        this.bandMaterial = bandMaterial;
        this.movementType = movementType;
        this.waterResistance = waterResistance;
        this.hasChronograph = hasChronograph;
        System.out.println("New watch instance created with brand: " + this.brand + ", model: " + this.model);
    }

    public static class Display {
        private String type;
        private int resolution;
        private boolean isTouchscreen;

        public Display(String type, int resolution, boolean isTouchscreen) {
            this.type = type;
            this.resolution = resolution;
            this.isTouchscreen = isTouchscreen;
            System.out.println("New display instance created with type: " + this.type);
        }

        public void turnOn() {
            System.out.println("Display turned on");
        }

        public void turnOff() {
            System.out.println("Display turned off");
        }

        public void adjustBrightness(int level) {
            System.out.println("Brightness adjusted to level " + level);
        }
    }

    public static class Battery {
        private String type;
        private int capacity;
        private boolean isRechargeable;

        public Battery(String type, int capacity, boolean isRechargeable) {
            this.type = type;
            this.capacity = capacity;
            this.isRechargeable = isRechargeable;
            System.out.println("New battery instance created with type: " + this.type);
        }

        public void charge() {
            System.out.println("Battery charging");
        }

        public void discharge() {
            System.out.println("Battery discharging");
        }

        public void replace() {
            System.out.println("Battery replaced");
        }
    }

    public void setTime(int hours, int minutes) {
        System.out.println("Setting time to " + hours + ":" + minutes);
    }

    public void startTimer() {
        System.out.println("Timer started");
    }

    public void stopTimer() {
        System.out.println("Timer stopped");
    }

    public static void main(String[] args) {
        Watch watch1 = new Watch("Rolex", "Submariner", 40, "Stainless steel", "Oyster", "Automatic", 300, true);
        Watch watch2 = new Watch("Omega", "Speedmaster", 42, "Stainless steel", "Bracelet", "Manual winding", 50, true);
        Watch watch3 = new Watch("Breitling", "Navitimer", 41, "Stainless steel", "Leather", "Automatic", 50, false);

        Display display1 = new Display("OLED", 400, true);
        Display display2 = new Display("LCD", 300, false);
        Display display3 = new Display("AMOLED", 500, true);

        Battery battery1 = new Battery("Lithium ion", 300, true);
        Battery battery2 = new Battery("Alkaline", 200, false);
        Battery battery3 = new Battery("Nickel-metal hydride", 250, true);
    }
}

