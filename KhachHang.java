package bai2;

import java.time.LocalDate;

public class KhachHang {

    private String customer_id, name;
    private LocalDate invoice_date;
    private double quantity;
    private double unit_price;

    public KhachHang() {
    }

    public KhachHang(String customer_id, String name, LocalDate invoice_date, double quantity, double unit_price) {
        this.customer_id = customer_id;
        this.name = name;
        this.invoice_date = invoice_date;
        this.quantity = quantity;
        this.unit_price = unit_price;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(LocalDate invoice_date) {
        this.invoice_date = invoice_date;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public double amount(){
        System.out.println("Don't have data");
        return 0.0;
    }
    @Override
    public String toString() {
        return "customer_id=" + customer_id + ", name=" + name + ", invoice_date=" + invoice_date + ", quantity=" + quantity + ", unit_price=" + unit_price ;
    }
}
