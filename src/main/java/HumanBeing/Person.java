package HumanBeing;

public class Person {
    private String name;
    private int age;
    private String favSport;
    private String occupation;
    private double salary;

    public Person(){
    }
    //constructor

    public Person(String name, int age, String favSport, String occupation, double salary){
        this.name = name;
        this.age = age;
        this.favSport = favSport;
        this.occupation = occupation;
        this.salary = salary;
    }

    public String printThisMessage(){
        return "My name is " + name + " and I am " + age + " years old." + " My favorite sport is " + favSport + " and by this time next year my occupation will be an " + occupation + " meaning I will be making up to " + salary + " yearly.";
    }

    public String originalSalary(String name){
        return name;
    }

    public String newSalary(){
        return "Updated salary:";
    }

    public double yearlyBonusAdded(double bonus){
        return salary + bonus;
    }
    public String printBonusAdded(){
        return "Salary after bonus added:";
    }

    public String printName(String name){
        return name;
    }
    public Boolean printOccupation(String name){
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavSport() {
        return favSport;
    }

    public void setFavSport(String favSport) {
        this.favSport = favSport;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


