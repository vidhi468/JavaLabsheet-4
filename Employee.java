public class Employee {
    private String name;
    private int empId;
    private double salary;

    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Emp ID : " + empId);
        System.out.println("Salary : Rs. " + salary);
    }
}
