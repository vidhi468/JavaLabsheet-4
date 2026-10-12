public class MedicineStock {
    String name;
    int quantity;
    double price;

    MedicineStock(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println(name + " | Qty: " + quantity + " | Price: Rs. " + price);
    }
}
