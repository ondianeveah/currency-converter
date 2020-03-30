package HumanBeing;

public class Faculty extends Employee {
    public Faculty(String name, Integer age, String hasJob) {
        super(name, age, hasJob);
    }

    public String saysGoodMorning(){
        return "Good morning " + getName();
    }
}
