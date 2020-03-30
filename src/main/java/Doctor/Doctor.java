package Doctor;

public abstract class Doctor {
    private Boolean worksAtHospital;

    public Doctor(Boolean worksAtHospital){
        this.worksAtHospital = worksAtHospital;
    }

    public abstract String treatPatient();
}
