package p_1;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private int[] marks; // store marks of subjects
    private double average;
    private char grade;

    // Constructor
    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        calculateAverageAndGrade();
    }

    // Calculate average and grade
    private void calculateAverageAndGrade() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        this.average = (double) sum / marks.length;

        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 50) grade = 'C';
        else grade = 'F';
    }

    public void display() {
        System.out.print("Roll No: " + rollNo + ", Name: " + name + ", Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println("\nAverage: " + average + ", Grade: " + grade);
        System.out.println("--------------------------------------");
    }
}


public class Proj1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("=== Student Marks Management System ===");

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter number of subjects: ");
                    int n = sc.nextInt();

                    int[] marks = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter marks for subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                    }

                    Student s = new Student(name, rollNo, marks);
                    students.add(s);
                    System.out.println("✅ Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\n--- Student Records ---");
                        for (Student st : students) {
                            st.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}