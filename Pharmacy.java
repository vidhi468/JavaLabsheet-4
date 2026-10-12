public class Pharmacy {
    // static = one copy shared by every object of the class
    static String pharmacyName = "Ganga Pharmacy";
    static String location = "Haridwar";

    String pharmacistName;   // instance variable: separate for each object

    Pharmacy(String pharmacistName) {
        this.pharmacistName = pharmacistName;
    }

    void display() {
        System.out.println(pharmacistName + " works at " + pharmacyName + ", " + location);
    }
}
