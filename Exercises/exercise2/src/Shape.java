// Shape.java
public abstract class Shape {

    protected String color; // instance variable

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea(); // abstract method

    public abstract double calculatePerimeter(); // abstract method

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static void displayShapeInfo(Shape shape) {
        System.out.println("Shape: " + shape.getClass().getSimpleName());
        System.out.println("Color: " + shape.getColor());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
    }
}
