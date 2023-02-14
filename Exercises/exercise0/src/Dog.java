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
        System.out.println("New dog created: " + name);
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

    public class Breed {
        private String name;
        private String countryOfOrigin;
        private int averageWeight;
        private int averageHeight;
        private String temperament;
        private String group;

        public Breed(String name, String countryOfOrigin, int averageWeight, int averageHeight, String temperament, String group) {
            this.name = name;
            this.countryOfOrigin = countryOfOrigin;
            this.averageWeight = averageWeight;
            this.averageHeight = averageHeight;
            this.temperament = temperament;
            this.group = group;
            System.out.println("New breed created: " + name);
        }

        public void description() {
            System.out.println(name + " is a " + group + " dog from " + countryOfOrigin + " with an average weight of " + averageWeight + " kg and an average height of " + averageHeight + " cm.");
        }

        public void temperament() {
            System.out.println(name + " is known for its " + temperament + " temperament.");
        }

        public void trainability() {
            System.out.println(name + " is " + (isTrained ? "well-trained" : "not well-trained") + ".");
        }
    }

    public class Color {
        private String name;
        private String code;
        private String description;
        private boolean isCommon;
        private boolean isRecognized;

        public Color(String name, String code, String description, boolean isCommon, boolean isRecognized) {
            this.name = name;
            this.code = code;
            this.description = description;
            this.isCommon = isCommon;
            this.isRecognized = isRecognized;
            System.out.println("New color created: " + name);
        }

        public void description() {
            System.out.println(name + " is " + description + ".");
        }

        public void isCommon() {
            System.out.println(name + " is " + (isCommon ? "" : "not ") + "a common color.");
        }

        public void isRecognized() {
            System.out.println(name + " is " + (isRecognized ? "" : "not ") + "a recognized color.");
        }
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", 3, "Labrador Retriever", "Yellow", 30, true, true, false);
        Dog dog2 = new Dog("Buddy", 5, "Beagle", "Tri-color", 12, false, true, true);
        Dog dog3 = new Dog("Lucy", 2, "German Shepherd", "Black and Tan", 35, true, true, false);

        Dog.Breed breed1 = dog1.new Breed("Labrador Retriever", "Canada", 30, 60, "Friendly, Outgoing, Active", "Sporting");
        Dog.Breed breed2 = dog2.new Breed("Beagle", "England", 10, 33, "Friendly, Curious, Merry", "Hound");
        Dog.Breed breed3 = dog3.new Breed("German Shepherd", "Germany", 30, 65, "Confident, Courageous, Smart", "Herding");

        Dog.Color color1 = dog1.new Color("Yellow", "YEL", "a popular color for Labradors", true, true);
        Dog.Color color2 = dog2.new Color("Tri-color", "TRI", "a common color for Beagles", true, true);
        Dog.Color color3 = dog3.new Color("Black and Tan", "BKT", "a classic color for German Shepherds", true, true);

        dog1.bark();
        breed1.description();
        color1.description();

        dog2.sit();
        breed2.temperament();
        color2.isRecognized();

        dog3.fetch();
        breed3.trainability();
        color3.isCommon();
    }
}


