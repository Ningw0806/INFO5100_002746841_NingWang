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
        System.out.println("New cactus instance " + species + " was created, " + "the color is " + color + ".");
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

    public static void main(String[] args) {
        // Instantiate 3 Cactus objects
        Cactus cactus1 = new Cactus(10, 5, "Prickly Pear", "Green", true, false, true, true);
        Cactus cactus2 = new Cactus(15, 10, "Barrel Cactus", "Brown", true, true, false, true);
        Cactus cactus3 = new Cactus(5, 2, "Fishhook Cactus", "Yellow", true, false, true, true);
    }
}


