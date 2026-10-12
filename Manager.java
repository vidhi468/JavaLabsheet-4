public class Manager extends Employee {
    private String department;

    Manager(String name, int empId, double salary, String department) {
        super(name, empId, salary);
        this.department = department;
    }

    @Override
    void display() {
        System.out.println("--- Manager ---");
        super.display();
        System.out.println("Department: " + department);
    }
}
