public class Cactus {
    private int height;
    private int age;
    private String species;
    private String color;
    private boolean isThorny;
    private boolean hasFlowers;
    private boolean isWatered;
    private boolean isAlive;

    public Cactus(int height, int age, String species, String color, boolean isThorny, boolean hasFlowers, boolean isWatered, boolean isAlive) {
        this.height = height;
        this.age = age;
        this.species = species;
        this.color = color;
        this.isThorny = isThorny;
        this.hasFlowers = hasFlowers;
        this.isWatered = isWatered;
        this.isAlive = isAlive;
        System.out.println("New cactus instance created.");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isThorny() {
        return isThorny;
    }

    public void setThorny(boolean thorny) {
        isThorny = thorny;
    }

    public boolean hasFlowers() {
        return hasFlowers;
    }

    public void setHasFlowers(boolean hasFlowers) {
        this.hasFlowers = hasFlowers;
    }

    public boolean isWatered() {
        return isWatered;
    }

    public void setWatered(boolean watered) {
        isWatered = watered;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public class Flower {
        private String color;
        private int numPetals;
        private boolean isEdible;

        public Flower(String color, int numPetals, boolean isEdible) {
            this.color = color;
            this.numPetals = numPetals;
            this.isEdible = isEdible;
            System.out.println("New flower instance created.");
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getNumPetals() {
            return numPetals;
        }

        public void setNumPetals(int numPetals) {
            this.numPetals = numPetals;
        }

        public boolean isEdible() {
            return isEdible;
        }

        public void setEdible(boolean edible) {
            isEdible = edible;
        }
    }

    public class Thorn {
        private int length;
        private String color;
        private boolean isSharp;

        public Thorn(int length, String color, boolean isSharp) {
            this.length = length;
            this.color = color;
            this.isSharp = isSharp;
            System.out.println("New thorn instance created.");
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isSharp() {
            return isSharp;
        }

        public void setSharp(boolean sharp) {
            isSharp = sharp;
        }
    }

    public static void main(String[] args) {
        // Instantiate 3 Cactus objects
        Cactus cactus1 = new Cactus(10, 5, "Prickly Pear", "Green", true, false, true, true);
        Cactus cactus2 = new Cactus(15, 10, "Barrel Cactus", "Brown", true, true, false, true);
        Cactus cactus3 = new Cactus(5, 2, "Fishhook Cactus", "Yellow", true, false, true, true);

        // Instantiate 3 Flower objects for the first cactus
        Cactus.Flower flower1 = cactus1.new Flower("Yellow", 5, true);
        Cactus.Flower flower2 = cactus1.new Flower("Red", 4, false);
        Cactus.Flower flower3 = cactus1.new Flower("Orange", 6, true);

        // Instantiate 3 Thorn objects for the second cactus
        Cactus.Thorn thorn1 = cactus2.new Thorn(3, "Brown", true);
        Cactus.Thorn thorn2 = cactus2.new Thorn(5, "Green", true);
        Cactus.Thorn thorn3 = cactus2.new Thorn(7, "Black", false);
    }
}


