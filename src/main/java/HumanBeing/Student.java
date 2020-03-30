package HumanBeing;

public class Student extends CommunityMember {
    private String school;
    public Student(String name, Integer age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public String saysGoodMorning() {
        return "Good morning " + getName();
    }
}
