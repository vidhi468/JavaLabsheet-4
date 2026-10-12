public class Inventory {
    MedicineStock[] stock = new MedicineStock[4];

    Inventory() {
        stock[0] = new MedicineStock("Paracetamol", 120, 25.50);
        stock[1] = new MedicineStock("Amoxicillin", 60, 80.00);
        stock[2] = new MedicineStock("Cetirizine", 90, 12.75);
        stock[3] = new MedicineStock("Ibuprofen", 75, 30.00);
    }

    // The loop belongs to Inventory, not main
    void showStock() {
        System.out.println("===== Pharmacy Inventory =====");
        for (int i = 0; i < stock.length; i++) {
            stock[i].display();
        }
    }
}
