package Doctor;

public class FamilyDoctor extends Doctor {
    private Boolean makesHouseCalls;

    public FamilyDoctor(Boolean worksAtHospital, Boolean makesHouseCalls) {
        super(worksAtHospital);
        this.makesHouseCalls = makesHouseCalls;
    }

    @Override
    public String treatPatient() {
        return "I treat people I've known for years.";
    }

    public String givesAdvice(){
        return "Get some rest.";
    }
}
