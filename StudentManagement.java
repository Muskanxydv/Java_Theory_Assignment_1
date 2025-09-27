import java.util.ArrayList;
import java.util.Scanner;

class Person {
    protected String name;

    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private char grade;

    public Student() {
        super();
        this.rollNo = 0;
        this.course = "";
        this.marks = 0.0;
        this.grade = 'F';
    }


    public Student(int rollNo, String name, String course, double marks) {
        super(name);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }

    public void inputDetails(Scanner input) {
        System.out.print("Enter Roll Number: ");
        rollNo = input.nextInt();
        input.nextLine();

        System.out.print("Enter Name: ");
        name = input.nextLine();

        System.out.print("Enter Course: ");
        course = input.nextLine();

        System.out.print("Enter Marks (out of 100): ");
        marks = input.nextDouble();
        input.nextLine();

        calculateGrade();
    }

    public void displayDetails() {
        System.out.println("---- Student Details ----");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public void calculateGrade() {
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Student Menu =====");
            System.out.println("1. Add Student Details");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    Student newStudent = new Student();
                    newStudent.inputDetails(input);
                    students.add(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student records available.");
                    } else {
                        for (Student s : students) {
                            s.displayDetails();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }

        } while (choice != 3);

        input.close();
    }
}
