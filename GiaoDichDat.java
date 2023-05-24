
package GiaoDichNhaDat;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDichNhaDat{
    private char loaiDat;

    public GiaoDichDat(char loaiDat) {
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(char loaiDat, String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }
    @Override
    public void tinhtien(){
        if(loaiDat=='A'){
            double tinhtien = getDienTich() * getDonGia() * 1.5;
        }else{
            double tinhtien = getDienTich() * getDonGia();
        }
    }

    @Override
    public String toString() {
        return "GiaoDichDat{" +super.toString()+ "loaiDat=" + loaiDat + '}';
    }
    
}
