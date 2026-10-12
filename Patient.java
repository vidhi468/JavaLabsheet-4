public class Patient {
    private String name;
    private int age;
    private double billAmount;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Validation, as in the bank-account / bill tasks
    void addCharge(double amount) {
        if (amount > 0) {
            billAmount += amount;
        } else {
            System.out.println("Invalid charge ignored: " + amount);
        }
    }

    String classify() {
        if (age < 18) {
            return "Child - Pediatric Ward";
        } else if (age < 60) {
            return "Adult - General Ward";
        } else {
            return "Senior Citizen - Priority Care";
        }
    }

    void display() {
        System.out.println(name + " (age " + age + ") | " + classify()
                + " | Bill: Rs. " + billAmount);
    }
}
