import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks for Subject 1: ");
        int subject1 = sc.nextInt();

        System.out.print("Enter the marks for Subject 2: ");
        int subject2 = sc.nextInt();

        System.out.print("Enter the marks for Subject 3: ");
        int subject3 = sc.nextInt();

        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3;

        // Calculate percentage
        double percentage = (double) totalMarks / 3;

        // Determine the grade
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

       // Scanner.close();
    }
}