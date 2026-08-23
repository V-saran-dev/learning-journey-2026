import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Company> companies = new ArrayList<>();
    static ArrayList<Application> applications = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=================================");
            System.out.println("       CAMPUSHIRE SYSTEM");
            System.out.println("=================================");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");

            System.out.println("5. Add Company");
            System.out.println("6. View Companies");
            System.out.println("7. Check Student Eligibility");

            System.out.println("8. Apply for Placement");
            System.out.println("9. View Applications");
            System.out.println("10. Update Application Status");

            System.out.println("11. Exit");

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
                    addCompany();
                    break;

                case 6:
                    viewCompanies();
                    break;

                case 7:
                    checkEligibility();
                    break;

                case 8:
                    applyForPlacement();
                    break;

                case 9:
                    viewApplications();
                    break;

                case 10:
                    updateApplicationStatus();
                    break;

                case 11:
                    System.out.println("Thank you for using CampusHire!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // ==============================
    // STUDENT FUNCTIONS
    // ==============================

    static void addStudent() {

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student CGPA: ");
        double cgpa = scanner.nextDouble();

        Student student = new Student(id, name, cgpa);

        students.add(student);

        System.out.println("Student added successfully!");
    }


    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== STUDENT LIST =====");

        for (Student student : students) {
            student.displayStudent();
        }
    }


    static void searchStudent() {

        System.out.print("Enter student ID to search: ");
        int id = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {

                System.out.println("\nStudent found:");

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

            if (students.get(i).getId() == id) {

                students.remove(i);

                System.out.println("Student deleted successfully!");

                return;
            }
        }

        System.out.println("Student not found.");
    }


    // ==============================
    // COMPANY FUNCTIONS
    // ==============================

    static void addCompany() {

        System.out.print("Enter company ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter company name: ");
        String name = scanner.nextLine();

        System.out.print("Enter job role: ");
        String role = scanner.nextLine();

        System.out.print("Enter minimum CGPA: ");
        double minimumCgpa = scanner.nextDouble();

        Company company =
                new Company(id, name, role, minimumCgpa);

        companies.add(company);

        System.out.println("Company added successfully!");
    }


    static void viewCompanies() {

        if (companies.isEmpty()) {
            System.out.println("No companies found.");
            return;
        }

        System.out.println("\n===== COMPANY LIST =====");

        for (Company company : companies) {
            company.displayCompany();
        }
    }


    // ==============================
    // ELIGIBILITY
    // ==============================

    static void checkEligibility() {

        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();

        System.out.print("Enter company ID: ");
        int companyId = scanner.nextInt();

        Student selectedStudent = null;
        Company selectedCompany = null;

        // Find student

        for (Student student : students) {

            if (student.getId() == studentId) {

                selectedStudent = student;

                break;
            }
        }

        // Find company

        for (Company company : companies) {

            if (company.getId() == companyId) {

                selectedCompany = company;

                break;
            }
        }

        if (selectedStudent == null) {

            System.out.println("Student not found.");

            return;
        }

        if (selectedCompany == null) {

            System.out.println("Company not found.");

            return;
        }

        if (selectedStudent.getCgpa()
                >= selectedCompany.getMinimumCgpa()) {

            System.out.println("\nStudent is ELIGIBLE!");

        } else {

            System.out.println("\nStudent is NOT ELIGIBLE.");

        }
    }


    // ==============================
    // APPLICATION FUNCTIONS
    // ==============================

    static void applyForPlacement() {

        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();

        System.out.print("Enter company ID: ");
        int companyId = scanner.nextInt();

        Student selectedStudent = null;
        Company selectedCompany = null;

        // Find student

        for (Student student : students) {

            if (student.getId() == studentId) {

                selectedStudent = student;

                break;
            }
        }

        // Find company

        for (Company company : companies) {

            if (company.getId() == companyId) {

                selectedCompany = company;

                break;
            }
        }

        if (selectedStudent == null) {

            System.out.println("Student not found.");

            return;
        }

        if (selectedCompany == null) {

            System.out.println("Company not found.");

            return;
        }

        // Check eligibility

        if (selectedStudent.getCgpa()
                < selectedCompany.getMinimumCgpa()) {

            System.out.println(
                    "Student is not eligible for this company.");

            return;
        }

        Application application =
                new Application(
                        studentId,
                        companyId,
                        "APPLIED"
                );

        applications.add(application);

        System.out.println(
                "Application submitted successfully!");
    }


    static void viewApplications() {

        if (applications.isEmpty()) {

            System.out.println("No applications found.");

            return;
        }

        System.out.println("\n===== APPLICATIONS =====");

        for (Application application : applications) {

            application.displayApplication();
        }
    }


    static void updateApplicationStatus() {

        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();

        System.out.print("Enter company ID: ");
        int companyId = scanner.nextInt();

        scanner.nextLine();

        System.out.print(
                "Enter new status (APPLIED/SHORTLISTED/REJECTED/SELECTED): ");

        String status = scanner.nextLine().toUpperCase();

        for (Application application : applications) {

            if (application.getStudentId() == studentId
                    && application.getCompanyId() == companyId) {

                application.setStatus(status);

                System.out.println(
                        "Application status updated!");

                return;
            }
        }

        System.out.println("Application not found.");
    }
}