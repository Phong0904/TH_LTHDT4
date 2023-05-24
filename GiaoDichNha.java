
package GiaoDichNhaDat;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDichNhaDat{
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha(String loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(String loaiNha, String diaChi, String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    @Override
    public void tinhtien(){
        if(loaiNha.equals("caocap")){
            double tinhtien = getDienTich() * getDonGia();
        }else{
            double tinhtien = getDienTich() * getDonGia()* 0.9;
        }
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" + super.toString()+ "loaiNha=" + loaiNha + ", diaChi=" + diaChi + '}';
    }   
}
