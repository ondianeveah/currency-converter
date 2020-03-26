public class Monkey {
    private String color;
    private String name;

    //Constructor
    public Monkey() {
    }
    //Overloaded Constructor
    public Monkey(String color, String name){
        this.color = color;
        this.name = name;
    }

    public String swing(int distance){
        return name + " swings at " + distance + " feet per mile.";
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
