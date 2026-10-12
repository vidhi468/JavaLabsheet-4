public class Medicine {
    String name;
    double price;
    int quantity;

    // Parameter names are the same as the instance variables,
    // so 'this' is needed to tell them apart.
    Medicine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Medicine : " + name);
        System.out.println("Price    : Rs. " + price);
        System.out.println("Quantity : " + quantity);
    }
}
