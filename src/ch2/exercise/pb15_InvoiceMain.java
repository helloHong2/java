package ch2.exercise;

public class pb15_InvoiceMain {
    public static void main(String[] args) {
        pb15_Invoice invoice = new pb15_Invoice();
        invoice.addItem("Blackwell Toaster", 2, 24.95);
        invoice.addItem("ZapXpress Microwave Oven", 1, 49.95);
        invoice.print();
    }
}
