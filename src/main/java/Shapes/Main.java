package Shapes;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, true, 30, 50);
        Shape circle = new Circle(0, true,3.14,25);
        Shape rectangle = new Rectangle(4, true,70, 90);
        System.out.println(triangle.talk());
        System.out.println(triangle.getArea());
        System.out.println(circle.talk());
        System.out.println(circle.getArea());
        System.out.println(rectangle.talk());
        System.out.println(rectangle.getArea());

    }
}
