public class Application {

    private int studentId;
    private int companyId;
    private String status;

    public Application(int studentId, int companyId, String status) {
        this.studentId = studentId;
        this.companyId = companyId;
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayApplication() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Company ID: " + companyId);
        System.out.println("Status: " + status);
        System.out.println("-------------------------");
    }
}