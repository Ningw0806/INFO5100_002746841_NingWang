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
        System.out.println("Ring created!");
    }

    public int getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String getGemstone() {
        return gemstone;
    }

    public boolean getIsEngagement() {
        return isEngagement;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getDesign() {
        return design;
    }

    public double getPrice() {
        return price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setGemstone(String gemstone) {
        this.gemstone = gemstone;
    }

    public void setIsEngagement(boolean isEngagement) {
        this.isEngagement = isEngagement;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static class Engraving {
        private String text;
        private String font;
        private int size;

        public Engraving(String text, String font, int size) {
            this.text = text;
            this.font = font;
            this.size = size;
            System.out.println("Engraving created!");
        }

        public String getText() {
            return text;
        }

        public String getFont() {
            return font;
        }

        public int getSize() {
            return size;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setFont(String font) {
            this.font = font;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void engrave() {
            System.out.println("Engraving " + text + " with font " + font + " and size " + size + "...");
        }
    }

    public static class Box {
        private String material;
        private String color;
        private boolean hasLock;

        public Box(String material, String color, boolean hasLock) {
            this.material = material;
            this.color = color;
            this.hasLock = hasLock;
            System.out.println("Box created!");
        }

        public String getMaterial() {
            return material;
        }

        public String getColor() {
            return color;
        }

        public boolean getHasLock() {
            return hasLock;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setHasLock(boolean hasLock) {
            this.hasLock = hasLock;
        }

        public void open() {
            System.out.println("Opening the box...");
        }

        public void close() {
            System.out.println("Closing the box...");
        }
    }

    public static void main(String[] args) {
        Ring ring1 = new Ring(6, "Gold", "Diamond", true, "White", "Tiffany", "Solitaire", 1000.00);
        Ring ring2 = new Ring(7, "Silver", "Sapphire", false, "Blue", "Pandora", "Eternity", 500.00);
        Ring ring3 = new Ring(8, "Platinum", "Emerald", true, "Green", "Cartier", "Three-stone", 2000.00);

        Engraving engraving1 = new Engraving("Forever", "Script", 18);
        Engraving engraving2 = new Engraving("Love always", "Italic", 14);
        Engraving engraving3 = new Engraving("Together", "Bold", 12);

        Box box1 = new Box("Leather", "Black", true);
        Box box2 = new Box("Velvet", "Red", false);
        Box box3 = new Box("Wood", "Brown", true);
    }
}

