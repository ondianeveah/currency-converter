package HumanBeing;

public class Administrator extends Faculty {
    private String administrates;
    public Administrator(String name, Integer age, String hasJob, String administrates) {
        super(name, age, hasJob);
        this.administrates = administrates;
    }


    public String saysGoodMorning(){
        return "Good morning " + getName();
    }
}
