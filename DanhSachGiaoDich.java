package GiaoDichNhaDat;

import java.time.LocalDate;
import java.util.ArrayList;

public class DanhSachGiaoDich {

    private ArrayList<GiaoDichNhaDat> gdnd = new ArrayList<>();

    public void themGD(GiaoDichNhaDat nhadat) {
        gdnd.add(nhadat);
        System.out.println("Them thanh cong!!");
        System.out.println("-----------------");
    }

    public void inGD() {
        for (GiaoDichNhaDat s : gdnd) {
            System.out.println(s);
        }
    }

    public void tinhsoluong() {
        int slnha = 0;
        int sldat = 0;
        for (GiaoDichNhaDat s : gdnd) {
            if (s instanceof GiaoDichNha) {
                slnha++;
            } else if (s instanceof GiaoDichDat) {
                sldat++;
            }
        }
        System.out.println("Tong so luong giao dich nha la: " + slnha);
        System.out.println("Tong so luong giao dich dat la: " + sldat);
    }
    
    public void trungbinhgddat(){
        int sldat = 0;
        double tongtien=0;
        for (GiaoDichNhaDat s : gdnd) {
            if(s instanceof GiaoDichDat){
                sldat++;
                tongtien += s.getDonGia() * s.getDienTich();
            }
        }
        if(sldat > 0){
            double trungbinh = tongtien/sldat;
            System.out.println("Vay trung binh la: " + trungbinh);
        }else{
            System.out.println("Chua co giao dich nao");
        }
    }
    public void xuatgiaodich(LocalDate ngayGiaoDich){
        System.out.println("Cac giao dich sau " + ngayGiaoDich +":");
        
        for (GiaoDichNhaDat s : gdnd) {
            if(s.getNgayGiaoDich().isAfter(ngayGiaoDich)){
                System.out.println(s);
            }
        }
    }
}
