public class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int empId, double salary, String specialization) {
        super(name, empId, salary);
        this.specialization = specialization;
    }

    @Override
    void display() {
        System.out.println("--- Doctor ---");
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}
