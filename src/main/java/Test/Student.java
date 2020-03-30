package Test;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private Double[] scores;

    public Student(String firstName, String lastName, Double[] scores){
        this.firstName= firstName;
        this.lastName = lastName;
        this.scores = scores;
    }

    public double totalScores(Double[] totalScores) {
        int sum = 0;
        for (int x = 0; x < totalScores.length; x++) {
            sum += totalScores[x];
        }
        return sum;
    }

    public double calculateAverage(Double[] totalScores){
        return totalScores(totalScores) / totalScores.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }

}
