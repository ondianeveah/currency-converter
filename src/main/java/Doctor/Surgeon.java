package Doctor;

public class Surgeon extends Doctor {
    private String name;

    public Surgeon(Boolean worksAtHospital, String name) {
        super(worksAtHospital);
        this.name = name;
    }

    @Override
    public String treatPatient() {
        return "I am a " + getName() + " and I treat patients that need plastic surgery.";
    }

    public String getName() {
        return name;
    }
}
