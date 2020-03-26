public class Employee{
    private String firstName;
    private String lastName;
   // private final String socialSecurityNumber = "22-546-5359";
    private double salary;
    private String title;
    private double bonus;

    public Employee(){
    }
    //overloaded constructor

    public Employee(String title, String firstName, String lastName, double salary){
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public double payCheck(double bonus, double salary){
        return bonus + salary;
    }
    public String printEmployeeProfile(String firstName, String lastName, double salary, String title){
        return firstName + lastName + "\n" + salary + "\n" + title;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", title='" + title + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

