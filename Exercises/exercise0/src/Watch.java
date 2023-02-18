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
        System.out.println("New watch instance created with brand: " + brand + ", model: " + model + ".");
    }

    public void setTime(int hours, int minutes) {
        System.out.println(brand + " setting time to " + hours + ":" + minutes);
    }

    public void startTimer() {
        System.out.println(brand + " timer started");
    }

    public void stopTimer() {
        System.out.println(brand + " timer stopped");
    }

    public static void main(String[] args) {
        Watch watch1 = new Watch("Rolex", "Submariner", 40, "Stainless steel", "Oyster", "Automatic", 300, true);
        Watch watch2 = new Watch("Omega", "Speedmaster", 42, "Stainless steel", "Bracelet", "Manual winding", 50, true);
        Watch watch3 = new Watch("Breitling", "Navitimer", 41, "Stainless steel", "Leather", "Automatic", 50, false);

        watch1.setTime(1, 25);
        watch2.startTimer();
        watch3.stopTimer();
    }
}

