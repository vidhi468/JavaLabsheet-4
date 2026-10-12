public class HospitalSystem {
    // static: shared by the whole system
    static String hospitalName = "Ganga Care Hospital";
    static String location = "Haridwar";

    private Employee[] staff = new Employee[3];
    private Patient[] patients = new Patient[3];

    HospitalSystem() {
        // Inheritance: Doctor, Pharmacist, Manager are all Employees
        staff[0] = new Doctor("Dr. Meera Joshi", 101, 90000, "Cardiology");
        staff[1] = new Pharmacist("Ravi Kumar", 301, 35000, "UK-PH-4521");
        staff[2] = new Manager("Sunil Rawat", 501, 120000, "Administration");

        patients[0] = new Patient("Riya", 10);
        patients[1] = new Patient("Karan", 35);
        patients[2] = new Patient("Mohan Lal", 68);
    }

    void run() {
        System.out.println("========== " + hospitalName + ", " + location + " ==========\n");

        System.out.println(">> STAFF");
        for (int i = 0; i < staff.length; i++) {
            staff[i].display();
            System.out.println();
        }

        System.out.println(">> PATIENTS");
        patients[0].addCharge(500);
        patients[1].addCharge(1200);
        patients[1].addCharge(-50);    // rejected by validation
        patients[2].addCharge(2500);
        for (int i = 0; i < patients.length; i++) {
            patients[i].display();
        }
    }
}
