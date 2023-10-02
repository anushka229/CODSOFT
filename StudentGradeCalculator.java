import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int num_subjects = sc.nextInt();

        int total_marks = 0;
        for (int i = 1; i <= num_subjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = sc.nextInt();
            total_marks += marks;
        }

        double percentage = (double) total_marks / num_subjects;

        char grade = calculate_grade(percentage);

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + total_marks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }

    private static char calculate_grade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
