package Shapes;

public class Rectangle extends Shape {
    private Boolean fourSidesOfRectangle;
    private Integer length;
    private Integer width;

    public Rectangle(int sides, Boolean fourSidesOfRectangle, Integer length, Integer width) {
        super(sides);
        this.fourSidesOfRectangle = fourSidesOfRectangle;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public String talk() {
        return "My name is Rectangle";
    }

    public String getArea() {
        return "Area is: " + calculateArea();
    }
}
