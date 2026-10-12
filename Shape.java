public class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    double calculateArea() {
        return 0;   // each child overrides this with its own formula
    }

    void displayArea() {
        System.out.println("Area of " + name + " = " + calculateArea());
    }
}
