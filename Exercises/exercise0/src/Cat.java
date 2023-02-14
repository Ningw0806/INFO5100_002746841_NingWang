public class Cat {
    private String name;
    private int age;
    private String breed;
    private String color;
    private double weight;
    private boolean isMale;
    private boolean isNeutered;
    private boolean isVaccinated;

    public Cat(String name, int age, String breed, String color, double weight, boolean isMale, boolean isNeutered, boolean isVaccinated) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.isMale = isMale;
        this.isNeutered = isNeutered;
        this.isVaccinated = isVaccinated;
        System.out.println("New cat instance created: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public boolean isNeutered() {
        return isNeutered;
    }

    public void setNeutered(boolean isNeutered) {
        this.isNeutered = isNeutered;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public static class Toy {
        private String name;
        private String material;
        private boolean isInteractive;

        public Toy(String name, String material, boolean isInteractive) {
            this.name = name;
            this.material = material;
            this.isInteractive = isInteractive;
            System.out.println("New toy instance created: " + name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public boolean isInteractive() {
            return isInteractive;
        }

        public void setInteractive(boolean isInteractive) {
            this.isInteractive = isInteractive;
        }
    }

    public static class Food {
        private String brand;
        private String flavor;
        private double price;

        public Food(String brand, String flavor, double price) {
            this.brand = brand;
            this.flavor = flavor;
            this.price = price;
            System.out.println("New food instance created: " + brand);
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getFlavor() {
            return flavor;
        }

        public void setFlavor(String flavor) {
            this.flavor = flavor;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Mittens", 5, "Siamese", "gray", 9.5, false, true, true);
        Cat cat2 = new Cat("Whiskers", 2, "Persian", "white", 7.2, true, false, false);
        Cat cat3 = new Cat("Boots", 3, "Maine Coon", "brown", 13.1, true, false, true);

        Toy toy1 = new Toy("Feather Wand", "feathers", true);
        Toy toy2 = new Toy("Catnip Mouse", "plush", false);
        Toy toy3 = new Toy("Scratching Post", "wood", false);

        Food food1 = new Food("Purina", "Chicken", 8.99);
        Food food2 = new Food("Hill's Science Diet", "Salmon", 12.49);
        Food food3 = new Food("Blue Buffalo", "Turkey", 9.99);
    }
}
