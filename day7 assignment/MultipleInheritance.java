import java.util.Scanner;

interface Student {
    void getStudentInfo();
}

interface Result {
    void calculateResult();
    void displayResult();
}

class StudentResult implements Student, Result {
    String name;
    int rollNumber;
    int[] marks = new int[5];
    int totalMarks;
    double percentage;

    @Override
    public void getStudentInfo() {
        try (
            Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter student name: ");
            name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            rollNumber = scanner.nextInt();

            System.out.println("Enter marks for 5 subjects: ");
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }
        }
    }

    @Override
    public void calculateResult() {
        totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += marks[i];
        }
        percentage = (totalMarks / 500.0) * 100;
    }

    @Override
    public void displayResult() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        StudentResult student = new StudentResult();

        student.getStudentInfo();
        student.calculateResult();
        student.displayResult();
    }
}