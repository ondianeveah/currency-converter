package HumanBeing;

public class Main {
    public static void main(String[] args) {
        CommunityMember employee = new Employee("Ondia", 21, "Wawa Manager");
        System.out.println(employee.saysGoodMorning());

        CommunityMember student = new Student("Maddy", 19, "Polytech HS");
        System.out.println(student.saysGoodMorning());

        CommunityMember alumnus = new Alumnus("John", 24, "Graduated from UD");
        System.out.println(alumnus.saysGoodMorning());

        Employee faculty = new Faculty("Willy Bob", 57, "Gym teacher");
        System.out.println(faculty.saysGoodMorning());

        Employee staff = new Staff("John", 35, "Janitor");
        System.out.println(staff.saysGoodMorning());

        Faculty administrator = new Administrator("Lisa", 23, "School administrator", "Administrates at Polytech HS");
        System.out.println(administrator.saysGoodMorning());

        Faculty teacher = new Teacher("Mary Kay", 62, "BritLit teacher.");
        System.out.println(teacher.saysGoodMorning());



    }
}
