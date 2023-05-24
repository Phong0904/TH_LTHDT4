package GiaoDichNhaDat;

import java.time.LocalDate;

public class GiaoDichNhaDat {
    private String maGiaoDich;
    private LocalDate ngayGiaoDich;
    private double donGia;
    private double dienTich;

    public GiaoDichNhaDat() {
    }

    public GiaoDichNhaDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void tinhtien(){
        System.out.println("chua xac nhan duoc ma giao");
    }
    @Override
    public String toString() {
        return "GiaoDichNhaDat{" + "maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia + ", dienTich=" + dienTich + '}';
    }
}
