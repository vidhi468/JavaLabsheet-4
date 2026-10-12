public class MedicineProduct {
    // private: cannot be accessed directly from outside the class
    private String name;
    private double price;
    private String expiryDate;

    MedicineProduct(String name, double price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    // The class itself displays its data
    void display() {
        System.out.println("Product : " + name);
        System.out.println("Price   : Rs. " + price);
        System.out.println("Expiry  : " + expiryDate);
    }
}
