package Shapes;

public class Triangle extends Shape {
    private Boolean hasThreeSides;
    private Integer height;
    private Integer base;


    public Triangle(int sides, Boolean hasThreeSides, Integer height, Integer base) {
        super(sides);
        this.hasThreeSides = hasThreeSides;
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return height * base / 2;
    }

    public String talk() {
        return "My name is triangle";
    }

    public String getArea() {
        return "Area is: " + calculateArea();
    }
}

