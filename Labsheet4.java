import java.util.Scanner;

/*
 * Lab Sheet 4 - Object Oriented Programming Using Java
 * Name    : Shanu Sharma
 * Course  : MCA 3rd Semester, College of Smart Computing
 *
 * Topic   : Classes, Objects, Constructors, static, Encapsulation, Inheritance
 *
 * Every question has its own class(es). The main class (Labsheet4) only
 * creates objects and calls their methods - the real logic and the display
 * code stay inside the classes, as the lab sheet requires.
 */

// ====================================================================
// 1. Student Record
// ====================================================================
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
    }
}

// ====================================================================
// 2. Medicine (parameterized constructor, "this" keyword)
// ====================================================================
class Medicine {
    String name;
    double price;
    int quantity;

    Medicine(String name, double price, int quantity) {
        this.name = name;         // 'this' separates the instance variable
        this.price = price;       // from the constructor parameter
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Medicine : " + name);
        System.out.println("Price    : Rs. " + price);
        System.out.println("Quantity : " + quantity);
    }
}

// ====================================================================
// 3. Pharmacy (static variables are shared by all objects)
// ====================================================================
class Pharmacy {
    static String pharmacyName = "HealthPlus Pharmacy"; // shared by every object
    static String location = "Main Market";             // shared by every object
    String pharmacistName;                              // separate for each object

    Pharmacy(String pharmacistName) {
        this.pharmacistName = pharmacistName;
    }

    static void changeLocation(String newLocation) {
        location = newLocation;
    }

    void display() {
        System.out.println("Pharmacy: " + pharmacyName + " | Location: " + location
                + " | Pharmacist: " + pharmacistName);
    }
}

// ====================================================================
// 4. Pharmacy Inventory (array and loop belong to Inventory)
// ====================================================================
class MedicineStock {
    String name;
    int quantity;
    double price;

    MedicineStock(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println(name + "\t\t" + quantity + "\t\tRs. " + price);
    }
}

class Inventory {
    private MedicineStock[] stocks;
    private int count = 0;

    Inventory(int capacity) {
        stocks = new MedicineStock[capacity];
    }

    void addStock(MedicineStock stock) {
        if (count < stocks.length)
            stocks[count++] = stock;
        else
            System.out.println("Inventory full. Cannot add " + stock.name);
    }

    void displayAll() {
        System.out.println("Medicine\tQuantity\tPrice");
        System.out.println("------------------------------------------");
        for (int i = 0; i < count; i++)
            stocks[i].display();
    }
}

// ====================================================================
// 5. Patient Eligibility (if-else inside a Patient method)
// ====================================================================
class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void classify() {
        System.out.println("Patient: " + name + ", Age: " + age);
        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 13) {
            System.out.println("Category: Child - Paediatric ward");
        } else if (age < 18) {
            System.out.println("Category: Teenager - Adolescent care");
        } else if (age < 60) {
            System.out.println("Category: Adult - General ward");
        } else {
            System.out.println("Category: Senior Citizen - Eligible for priority service and discount");
        }
    }
}

// ====================================================================
// 6. Encapsulated Medicine Product (private data, class displays itself)
// ====================================================================
class MedicineProduct {
    private String name;
    private double price;
    private int quantity;

    MedicineProduct(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product  : " + name);
        System.out.println("Price    : Rs. " + price);
        System.out.println("Quantity : " + quantity);
    }
}

// ====================================================================
// 7. Bank Account (private balance changed only through deposit)
// ====================================================================
class BankAccount {
    private String holder;
    private double balance;

    BankAccount(String holder, double openingBalance) {
        this.holder = holder;
        this.balance = openingBalance >= 0 ? openingBalance : 0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs. " + amount + " successfully.");
        } else {
            System.out.println("Deposit of Rs. " + amount + " rejected: amount must be positive.");
        }
    }

    double getBalance() {
        return balance;
    }

    void display() {
        System.out.println("Account Holder : " + holder);
        System.out.println("Balance        : Rs. " + balance);
    }
}

// ====================================================================
// 8. Patient Bill (private fees, setters, total calculation inside class)
// ====================================================================
class PatientBill {
    private String patientName;
    private double consultationFee;
    private double medicineFee;
    private double roomCharges;

    PatientBill(String patientName) {
        this.patientName = patientName;
    }

    void setConsultationFee(double fee) {
        if (fee >= 0)
            consultationFee = fee;
        else
            System.out.println("Invalid consultation fee ignored.");
    }

    void setMedicineFee(double fee) {
        if (fee >= 0)
            medicineFee = fee;
        else
            System.out.println("Invalid medicine fee ignored.");
    }

    void setRoomCharges(double charges) {
        if (charges >= 0)
            roomCharges = charges;
        else
            System.out.println("Invalid room charges ignored.");
    }

    double calculateTotal() {
        return consultationFee + medicineFee + roomCharges;
    }

    void display() {
        System.out.println("Patient          : " + patientName);
        System.out.println("Consultation Fee : Rs. " + consultationFee);
        System.out.println("Medicine Fee     : Rs. " + medicineFee);
        System.out.println("Room Charges     : Rs. " + roomCharges);
        System.out.println("Total Bill       : Rs. " + calculateTotal());
    }
}

// ====================================================================
// 9. Employee -> Pharmacist (single inheritance)
// 10. Employee -> Doctor and Pharmacist (hierarchical inheritance)
// ====================================================================
class Employee {
    static String hospitalName = "City Care Hospital";
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String getName() {
        return name;
    }

    void work() {
        System.out.println(name + " is working in the hospital.");
    }

    void display() {
        System.out.println("Hospital : " + hospitalName);
        System.out.println("Name     : " + name);
        System.out.println("ID       : " + id);
    }
}

class Pharmacist extends Employee {
    private String shift;

    Pharmacist(String name, int id, String shift) {
        super(name, id);
        this.shift = shift;
    }

    @Override
    void work() {
        System.out.println(getName() + " (Pharmacist) is dispensing medicines.");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Role     : Pharmacist");
        System.out.println("Shift    : " + shift);
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    void work() {
        System.out.println(getName() + " (Doctor) is examining patients.");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Role           : Doctor");
        System.out.println("Specialization : " + specialization);
    }
}

// ====================================================================
// 11. Multilevel: Person -> Employee -> Manager
// (nested classes are used so these names do not clash with the
//  Employee class used in questions 9, 10 and 15)
// ====================================================================
class MultilevelDemo {

    static class Person {
        protected String name;
        protected int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void introduce() {
            System.out.println("I am " + name + ", " + age + " years old.");
        }
    }

    static class Employee extends Person {
        protected int empId;

        Employee(String name, int age, int empId) {
            super(name, age);
            this.empId = empId;
        }

        void work() {
            System.out.println(name + " (ID " + empId + ") is doing assigned work.");
        }
    }

    static class Manager extends Employee {
        private String department;

        Manager(String name, int age, int empId, String department) {
            super(name, age, empId);
            this.department = department;
        }

        void manageTeam() {
            System.out.println(name + " is managing the " + department + " department.");
        }
    }

    void run() {
        Manager m = new Manager("Anita Verma", 40, 501, "Pharmacy");
        m.introduce();   // inherited from Person
        m.work();        // inherited from Employee
        m.manageTeam();  // defined in Manager
    }
}

// ====================================================================
// 12 & 13. Concept only - no multiple class inheritance, no interfaces
// ====================================================================
class InheritanceConcepts {

    // 12. Why Java cannot extend two classes
    void multipleInheritanceConcept() {
        System.out.println("MULTIPLE INHERITANCE (concept only)");
        System.out.println("-----------------------------------");
        System.out.println("Idea     : one child class having two parent classes.");
        System.out.println("In Java  : class C extends A, B   // NOT allowed - compile-time error");
        System.out.println();
        System.out.println("Why not? The DIAMOND PROBLEM (ambiguity):");
        System.out.println("   Class A has  void work()  -> prints \"Doctor work\"");
        System.out.println("   Class B has  void work()  -> prints \"Pharmacist work\"");
        System.out.println("   Class C extends A, B  and calls work()");
        System.out.println("   Which work() should C inherit - A's or B's? The compiler cannot decide.");
        System.out.println();
        System.out.println("Java's decision: a class can extend only ONE class.");
        System.out.println("This keeps code simple and removes ambiguity.");
    }

    // 13. Hybrid inheritance - understanding the structure
    void hybridInheritanceConcept() {
        System.out.println("HYBRID INHERITANCE (concept only)");
        System.out.println("---------------------------------");
        System.out.println("Idea : a mix of two or more inheritance types in one design.");
        System.out.println();
        System.out.println("Example structure:");
        System.out.println("                 Person");
        System.out.println("                   |");
        System.out.println("               Employee            <- multilevel (Person -> Employee -> ...)");
        System.out.println("              /        \\");
        System.out.println("          Doctor    Pharmacist     <- hierarchical (one parent, two children)");
        System.out.println("              \\        /");
        System.out.println("             HeadOfStaff           <- would need TWO parents (multiple inheritance)");
        System.out.println();
        System.out.println("In Java:");
        System.out.println("  - Multilevel and hierarchical parts can be written with extends.");
        System.out.println("  - The last link (HeadOfStaff extending both Doctor and Pharmacist)");
        System.out.println("    is multiple class inheritance, so Java does not allow it.");
        System.out.println("  - Hence, a full hybrid structure cannot be built with classes alone.");
    }
}

// ====================================================================
// 14. Shape hierarchy (each child calculates its own area)
// ====================================================================
class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    double area() {
        return 0;
    }

    void display() {
        System.out.println("Shape : " + name);
        System.out.println("Area  : " + area());
    }
}

class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// ====================================================================
// 15. Final Hospital Staff System
// (uses: classes, objects, constructors, static, encapsulation,
//  inheritance, method overriding, array of objects)
// ====================================================================
class HospitalStaffSystem {
    private Employee[] staff;

    HospitalStaffSystem() {
        staff = new Employee[4];
        staff[0] = new Doctor("Dr. Rohan Mehta", 101, "Cardiology");
        staff[1] = new Doctor("Dr. Neha Singh", 102, "Paediatrics");
        staff[2] = new Pharmacist("Amit Kumar", 201, "Morning");
        staff[3] = new Pharmacist("Priya Nair", 202, "Evening");
    }

    void run() {
        System.out.println("===== " + Employee.hospitalName + " : Staff List =====");
        for (Employee e : staff) {
            e.display();
            System.out.println("-----------------------------");
        }
        System.out.println("Staff at work:");
        for (Employee e : staff)
            e.work(); // each object runs its own version of work()
        System.out.println("Total staff members: " + staff.length);
    }
}

// ====================================================================
// MAIN CLASS - only creates objects and calls methods
// ====================================================================
public class Labsheet4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n============ LAB SHEET 4 - JAVA (OOP) ============");
            System.out.println("  1. Student Record            9. Employee -> Pharmacist (single)");
            System.out.println("  2. Medicine (constructor)   10. Hierarchical hospital staff");
            System.out.println("  3. Pharmacy (static)        11. Multilevel: Person-Employee-Manager");
            System.out.println("  4. Pharmacy Inventory       12. Multiple inheritance (concept)");
            System.out.println("  5. Patient Eligibility      13. Hybrid inheritance (concept)");
            System.out.println("  6. Encapsulated Medicine    14. Shape hierarchy");
            System.out.println("  7. Bank Account             15. Final Hospital Staff System");
            System.out.println("  8. Patient Bill              0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:  q1();  break;
                case 2:  q2();  break;
                case 3:  q3();  break;
                case 4:  q4();  break;
                case 5:  q5();  break;
                case 6:  q6();  break;
                case 7:  q7();  break;
                case 8:  q8();  break;
                case 9:  q9();  break;
                case 10: q10(); break;
                case 11: q11(); break;
                case 12: q12(); break;
                case 13: q13(); break;
                case 14: q14(); break;
                case 15: q15(); break;
                case 0:  System.out.println("Exiting... Thank you!"); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }

    static void q1() {
        Student s = new Student("Shanu Sharma", 253028075);
        s.display();
    }

    static void q2() {
        Medicine m = new Medicine("Paracetamol 500mg", 25.50, 100);
        m.display();
    }

    static void q3() {
        Pharmacy p1 = new Pharmacy("Rahul Gupta");
        Pharmacy p2 = new Pharmacy("Sneha Joshi");
        System.out.println("Before changing the static location:");
        p1.display();
        p2.display();
        Pharmacy.changeLocation("Station Road"); // changed once, visible in both objects
        System.out.println("\nAfter changing the static location once:");
        p1.display();
        p2.display();
    }

    static void q4() {
        Inventory inventory = new Inventory(4);
        inventory.addStock(new MedicineStock("Paracetamol", 120, 25.50));
        inventory.addStock(new MedicineStock("Amoxicillin", 60, 85.00));
        inventory.addStock(new MedicineStock("Cetirizine", 90, 32.75));
        inventory.addStock(new MedicineStock("Ibuprofen", 75, 45.00));
        inventory.displayAll();
    }

    static void q5() {
        System.out.print("Enter patient name: ");
        String name = sc.next();
        System.out.print("Enter patient age: ");
        int age = sc.nextInt();
        Patient p = new Patient(name, age);
        p.classify();
    }

    static void q6() {
        MedicineProduct product = new MedicineProduct("Vitamin C Tablets", 120.0, 50);
        product.display();
    }

    static void q7() {
        BankAccount account = new BankAccount("Shanu Sharma", 1000);
        account.deposit(5000);
        account.deposit(-200); // rejected
        account.deposit(0);    // rejected
        account.display();
    }

    static void q8() {
        PatientBill bill = new PatientBill("Ramesh Kumar");
        bill.setConsultationFee(500);
        bill.setMedicineFee(850.50);
        bill.setRoomCharges(3000);
        bill.display();
    }

    static void q9() {
        Pharmacist ph = new Pharmacist("Amit Kumar", 201, "Morning");
        ph.display();  // Pharmacist's own display (uses Employee's display through super)
        ph.work();
    }

    static void q10() {
        Doctor d = new Doctor("Dr. Rohan Mehta", 101, "Cardiology");
        Pharmacist ph = new Pharmacist("Amit Kumar", 201, "Morning");
        d.display();
        d.work();
        System.out.println();
        ph.display();
        ph.work();
    }

    static void q11() {
        MultilevelDemo demo = new MultilevelDemo();
        demo.run();
    }

    static void q12() {
        InheritanceConcepts concepts = new InheritanceConcepts();
        concepts.multipleInheritanceConcept();
    }

    static void q13() {
        InheritanceConcepts concepts = new InheritanceConcepts();
        concepts.hybridInheritanceConcept();
    }

    static void q14() {
        Shape rect = new Rectangle(8, 5);
        Shape circle = new Circle(7);
        rect.display();
        System.out.println();
        circle.display();
    }

    static void q15() {
        HospitalStaffSystem system = new HospitalStaffSystem();
        system.run();
    }
}
