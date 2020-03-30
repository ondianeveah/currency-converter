package Shapes;

public abstract class Shape {
    private int sides;

    public Shape(int sides){
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }
    public String talk(){
        return "We all talk.";
    }

    public abstract double calculateArea();

    public String getArea(){
        return "Area is: " + calculateArea();
    }
}
