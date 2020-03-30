package HumanBeing;

public class Employee extends CommunityMember {
    private String hasJob;
    public Employee(String name, Integer age, String hasJob) {
        super(name, age);
        this.hasJob = hasJob;
    }

    @Override
    public String saysGoodMorning(){
        return "Good morning " + getName();
    }
}
