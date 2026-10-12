public class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int empId, double salary, String licenseNo) {
        super(name, empId, salary);
        this.licenseNo = licenseNo;
    }

    @Override
    void display() {
        System.out.println("--- Pharmacist ---");
        super.display();
        System.out.println("License: " + licenseNo);
    }
}
