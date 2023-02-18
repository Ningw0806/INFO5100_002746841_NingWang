public class Dog {
    private String name;
    private int age;
    private String breed;
    private String color;
    private int weight;
    private boolean isTrained;
    private boolean isVaccinated;
    private boolean isAdopted;

    public Dog(String name, int age, String breed, String color, int weight, boolean isTrained, boolean isVaccinated, boolean isAdopted) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.isTrained = isTrained;
        this.isVaccinated = isVaccinated;
        this.isAdopted = isAdopted;
        System.out.println("New dog created: " + name + ", breed is " + breed + ", color is " + color + ".");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    public void sit() {
        System.out.println(name + " is sitting");
    }

    public void fetch() {
        System.out.println(name + " is fetching");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", 3, "Labrador Retriever", "Yellow", 30, true, true, false);
        Dog dog2 = new Dog("Buddy", 5, "Beagle", "Tri-color", 12, false, true, true);
        Dog dog3 = new Dog("Lucy", 2, "German Shepherd", "Black and Tan", 35, true, true, false);

        dog1.bark();
        dog2.fetch();
        dog3.sit();
    }
}


