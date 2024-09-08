import java.util.Scanner;

public class task2_student_grade_calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = sc.nextInt();

        int[] marks = new int[numOfSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " : ");
            marks[i] = sc.nextInt();
                totalMarks += marks[i];

        }

        double averagePercentage = (double) totalMarks / numOfSubjects;

        char grade;
        if (averagePercentage >= 85) {
            grade = 'A';
        }
        else if (averagePercentage >= 70) {
            grade = 'B';
        }
        else if (averagePercentage >= 55) {
            grade = 'C';
        }
        else if (averagePercentage >= 40) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        System.out.println("\nTotal Marks Obtained is: " + totalMarks);
        System.out.println("Average Percentage Scored is: " + averagePercentage + "%");
        System.out.println("Grade Achieved: " + grade);
    }
}
