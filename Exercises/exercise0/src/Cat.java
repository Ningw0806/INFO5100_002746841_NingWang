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
        System.out.println("New cat instance created, name is " + name + ", breed is " + breed + ".");
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

    public static void main(String[] args) {
        Cat cat1 = new Cat("Mittens", 5, "Siamese", "gray", 9.5, false, true, true);
        Cat cat2 = new Cat("Whiskers", 2, "Persian", "white", 7.2, true, false, false);
        Cat cat3 = new Cat("Boots", 3, "Maine Coon", "brown", 13.1, true, false, true);

    }
}
