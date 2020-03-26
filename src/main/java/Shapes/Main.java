package Shapes;

public class Main {
    public static void main(String[] args) {
        Triangle bigTriangle = new Triangle(50, 100);
        System.out.println(bigTriangle.thisIsArea("Original area: "));
        System.out.println(bigTriangle.calculateArea());
        System.out.println(bigTriangle.newBase("New base: "));
        bigTriangle.setBase(75);
        System.out.println(bigTriangle.getBase());
        System.out.println(bigTriangle.newArea("New area: "));
        System.out.println(bigTriangle.calculateArea(273));

    }
}
