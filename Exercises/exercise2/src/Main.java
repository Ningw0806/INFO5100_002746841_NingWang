// Main.java
public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle("red", 3, 4, 5);
        Shape rectangle = new Rectangle("blue", 2, 4);
        Shape circle = new Circle("green", 5);
        Shape square = new Square("yellow", 4);

        Shape.displayShapeInfo(triangle);
        System.out.println();
        Shape.displayShapeInfo(rectangle);
        System.out.println();
        Shape.displayShapeInfo(circle);
        System.out.println();
        Shape.displayShapeInfo(square);
    }
}

