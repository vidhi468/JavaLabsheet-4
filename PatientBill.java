public class PatientBill {
    private String patientName;
    private double consultationFee;
    private double medicineFee;
    private double labFee;

    PatientBill(String patientName) {
        this.patientName = patientName;
    }

    // Setters with simple validation
    void setConsultationFee(double fee) {
        if (fee >= 0) consultationFee = fee;
    }

    void setMedicineFee(double fee) {
        if (fee >= 0) medicineFee = fee;
    }

    void setLabFee(double fee) {
        if (fee >= 0) labFee = fee;
    }

    // Calculation is done inside the class
    double calculateTotal() {
        return consultationFee + medicineFee + labFee;
    }

    void displayBill() {
        System.out.println("===== Patient Bill =====");
        System.out.println("Patient          : " + patientName);
        System.out.println("Consultation Fee : Rs. " + consultationFee);
        System.out.println("Medicine Fee     : Rs. " + medicineFee);
        System.out.println("Lab Fee          : Rs. " + labFee);
        System.out.println("TOTAL            : Rs. " + calculateTotal());
    }
}
