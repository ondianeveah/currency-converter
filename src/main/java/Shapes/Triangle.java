package Shapes;

public class Triangle {
    private int height;
    private int base;


    //empty constructor
    public Triangle(){
    }
    //Constructor
    public Triangle(int height, int base){
        this.height = height;
        this.base = base;
    }
// method
    public int calculateArea(){
        return (height * base) / 2;
    }
// overloaded method
    public int calculateArea(int x){
        return x * 10;
    }

    public String thisIsArea(String name) {
        return name;
    }
    public String newBase(String name){
        return name;
    }
    public String newArea(String name){
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    }

