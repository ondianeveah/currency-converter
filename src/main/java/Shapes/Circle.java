package Shapes;

public class Circle extends Shape {
    private Boolean hasNoSides;
    private Integer radius;
    private double pi = Math.PI;

    public Circle(int sides, Boolean hasNoSides, double pi, Integer radius) {
        super(sides);
        this.hasNoSides = hasNoSides;
        this.pi = pi;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String talk() {
        return "My name is circle";
    }

    public String getArea() {
        return "Area is: " + calculateArea();
    }
}
