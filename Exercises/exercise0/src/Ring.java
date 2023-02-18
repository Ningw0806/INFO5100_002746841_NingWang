public class Ring {
    private int size;
    private String material;
    private String gemstone;
    private boolean isEngagement;
    private String color;
    private String brand;
    private String design;
    private double price;

    public Ring(int size, String material, String gemstone, boolean isEngagement, String color, String brand, String design, double price) {
        this.size = size;
        this.material = material;
        this.gemstone = gemstone;
        this.isEngagement = isEngagement;
        this.color = color;
        this.brand = brand;
        this.design = design;
        this.price = price;
        System.out.println("Ring created!" + " Brand is " + brand + ", color is " + color + ".");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public static void main(String[] args) {
        Ring ring1 = new Ring(6, "Gold", "Diamond", true, "White", "Tiffany", "Solitaire", 1000.00);
        Ring ring2 = new Ring(7, "Silver", "Sapphire", false, "Blue", "Pandora", "Eternity", 500.00);
        Ring ring3 = new Ring(8, "Platinum", "Emerald", true, "Green", "Cartier", "Three-stone", 2000.00);
    }
}

