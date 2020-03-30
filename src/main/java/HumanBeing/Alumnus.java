package HumanBeing;

public class Alumnus extends CommunityMember {
    private String hasGrad;
    public Alumnus(String name, Integer age, String hasGrad ) {
        super(name, age);
        this.hasGrad = hasGrad;
    }

    @Override
    public String saysGoodMorning() {
        return "Good morning " + getName();
    }
}

