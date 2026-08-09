import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------------");
    }
}

public class StudentManagement {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("Thank you for using Student Management System!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();

        students.add(new Student(id, name, marks));

        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== Student List =====");

        for (Student student : students) {
            student.displayStudent();
        }
    }

    static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        int id = scanner.nextInt();

        for (Student student : students) {
            if (student.id == id) {
                System.out.println("Student found:");
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}