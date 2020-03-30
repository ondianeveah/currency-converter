package Doctor;

public class DoctorTester {
    public static void main(String[] args) {
        Doctor surgeon = new Surgeon(true, "Dr. Miami");
        Doctor familyDoctor = new FamilyDoctor(true, true);
        System.out.println(surgeon.treatPatient());
        System.out.println(familyDoctor.treatPatient());

    }
}
