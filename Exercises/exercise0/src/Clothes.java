public class Clothes {
    private String name;
    private String brand;
    private String color;
    private String size;
    private double price;
    private boolean isAvailable;
    private int quantity;
    private String material;

    public Clothes(String name, String brand, String color, String size, double price, boolean isAvailable, int quantity, String material) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isAvailable = isAvailable;
        this.quantity = quantity;
        this.material = material;
        System.out.println("A new piece of clothes has been created with name " + name + ", brand is " + brand + ".");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        // Instantiate 3 objects of Clothes class
        Clothes shirt1 = new Clothes("Classic Shirt", "Calvin Klein", "White", "M", 59.99, true, 10, "Cotton");
        Clothes pants1 = new Clothes("Straight Leg Pants", "Levi's", "Black", "32/32", 79.99, true, 5, "Denim");
        Clothes shirt2 = new Clothes("Polo Shirt", "Lacoste", "Blue", "L", 89.99, true, 15, "Cotton");
    }
}

