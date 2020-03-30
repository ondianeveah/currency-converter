package HumanBeing;

public class Teacher extends Faculty {
    public Teacher(String name, Integer age, String hasJob) {
        super(name, age, hasJob);
    }

    public String saysGoodmorning(){
        return "Good morning " + getName();
    }
}
