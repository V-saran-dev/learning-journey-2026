public class Company {

    private int id;
    private String name;
    private String role;
    private double minimumCgpa;

    public Company(int id, String name, String role, double minimumCgpa) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.minimumCgpa = minimumCgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getMinimumCgpa() {
        return minimumCgpa;
    }

    public void displayCompany() {
        System.out.println("Company ID: " + id);
        System.out.println("Company: " + name);
        System.out.println("Role: " + role);
        System.out.println("Minimum CGPA: " + minimumCgpa);
        System.out.println("-------------------------");
    }
}