package Test;

public class StudentTesteer {
    public static void main(String[] args) {
        Student student = new Student("Ondia", "Brown", "78.0, 98.0, 88.0");
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getArrayOfScores());
        double[]scores = {78.0, 98.0, 88.0};
        System.out.println("Total score of grades: ");
        System.out.println(student.returnTotalScores(scores));
        System.out.println(student.calculateAverage(scores));
    }
}
