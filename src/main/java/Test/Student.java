package Test;

public class Student {
    private String firstName;
    private String lastName;
    private String arrayOfScores;

    public Student(String firstName, String lastName, String arrayOfScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.arrayOfScores = arrayOfScores;
    }

    public double returnArrayOfScores(double[] arrayOfScores) {
        int scores = 0;
        for (int x = 0; x < arrayOfScores.length; x++) {
            scores += arrayOfScores[x];
        }
        return scores;
    }

    public double returnTotalScores(double[] totalScores) {
        int sum = 0;
        for (int x = 0; x < totalScores.length; x++) {
            sum += totalScores[x];
        }
        return sum;
    }

    public String calculateAverage(double[] totalScores){
        return "Ondia's average score is: " + returnTotalScores(totalScores) / 3;
    }

    public String getFirstName() {
        return "First name is: " + firstName;
    }

    public String getLastName() {
        return "Last name is: " + lastName;
    }

    public String getArrayOfScores() {
        return "Scores: " + arrayOfScores;
    }
}
