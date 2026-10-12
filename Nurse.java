public class Nurse extends Employee {
    Nurse(String name, int empId) {
        super(name, empId);
    }

    @Override
    void show() {
        System.out.println("[Nurse]");
        super.show();
    }
}
