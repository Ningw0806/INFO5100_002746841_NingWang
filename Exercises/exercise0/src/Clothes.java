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
        System.out.println("A new piece of clothes has been created with name " + this.name);
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

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public static class Shirt {

        private String collarType;
        private String sleeveType;
        private String shirtType;

        public Shirt(String collarType, String sleeveType, String shirtType) {
            this.collarType = collarType;
            this.sleeveType = sleeveType;
            this.shirtType = shirtType;
            System.out.println("A new shirt has been created with collar type " + this.collarType);
        }

        public String getCollarType() {
            return this.collarType;
        }

        public void setCollarType(String collarType) {
            this.collarType = collarType;
        }

        public String getSleeveType() {
            return this.sleeveType;
        }

        public void setSleeveType(String sleeveType) {
            this.sleeveType = sleeveType;
        }

        public String getShirtType() {
            return this.shirtType;
        }

        public void setShirtType(String shirtType) {
            this.shirtType = shirtType;
        }

    }

    public static class Pants {

        private String pantsType;
        private String waistSize;
        private String inseamSize;

        public Pants(String pantsType, String waistSize, String inseamSize) {
            this.pantsType = pantsType;
            this.waistSize = waistSize;
            this.inseamSize = inseamSize;
            System.out.println("A new pair of pants has been created with waist size " + this.waistSize);
        }


        public void setPantsType(String pantsType) {
            this.pantsType = pantsType;
        }

        public String getWaistSize() {
            return this.waistSize;
        }

        public void setWaistSize(String waistSize) {
            this.waistSize = waistSize;
        }

        public String getInseamSize() {
            return this.inseamSize;
        }

        public void setInseamSize(String inseamSize) {
            this.inseamSize = inseamSize;
        }

    }

    public static void main(String[] args) {
        // Instantiate 3 objects of Clothes class
        Clothes shirt1 = new Clothes("Classic Shirt", "Calvin Klein", "White", "M", 59.99, true, 10, "Cotton");
        Clothes pants1 = new Clothes("Straight Leg Pants", "Levi's", "Black", "32/32", 79.99, true, 5, "Denim");
        Clothes shirt2 = new Clothes("Polo Shirt", "Lacoste", "Blue", "L", 89.99, true, 15, "Cotton");

        // Instantiate 3 objects of Shirt class
        Shirt shirtType1 = new Shirt("Button-Down Collar", "Long Sleeve", "Dress Shirt");
        Shirt shirtType2 = new Shirt("Polo Collar", "Short Sleeve", "Casual Shirt");
        Shirt shirtType3 = new Shirt("Mandarin Collar", "Short Sleeve", "Summer Shirt");

        // Instantiate 3 objects of Pants class
        Pants pantsType1 = new Pants("Slim Fit", "30", "32");
        Pants pantsType2 = new Pants("Straight Fit", "34", "30");
        Pants pantsType3 = new Pants("Relaxed Fit", "36", "34");
    }
}

