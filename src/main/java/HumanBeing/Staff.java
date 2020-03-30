package HumanBeing;

public class Staff extends Employee {
    public Staff(String name, Integer age, String hasJob) {
        super(name, age, hasJob);
    }

    public String saysGoodMorning(){
        return "Good morning " + getName();
    }
}
