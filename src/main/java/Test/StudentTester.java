package Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentTester {
    public static void main(String[] args) {
        Double[] grades = {78.0, 57.0, 99.0};
        Student student = new Student("Ondia", "Brown", grades);
        System.out.println(student.toString());
        System.out.println("Ondia's scores are: " + Arrays.toString(grades));
        System.out.println("Ondia's total score is: " + student.totalScores(grades));
        System.out.println("Ondia's average is: " + student.calculateAverage(grades));
    }
}
