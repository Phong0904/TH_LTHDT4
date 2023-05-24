package GiaoDichNhaDat;

import java.time.LocalDate;
import java.util.Scanner;

public class MainFinal {

    public static void main(String[] args) {
        DanhSachGiaoDich dsgd = new DanhSachGiaoDich();
        Scanner sc = new Scanner(System.in);
        int menu, menu_1;

        do {
            System.out.println("===========");
            System.out.println("Chon menu");
            System.out.println("1. Them");
            System.out.println("2. In");
            System.out.println("3. Tinh sao luong tung loai");
            System.out.println("4. Tinh trung binh giao dich dat");
            System.out.println("5. Xuat giao dich sau ngay 24/5/2023");
            System.out.println("0. Thoat");
            System.out.print("Nhap: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    do {
                        System.out.println("1. Giao dich dat");
                        System.out.println("2. Giao dich nha");
                        System.out.println("0. Quay lai");
                        System.out.print("Nhap: ");
                        menu_1 = sc.nextInt();

                        switch (menu_1) {
                            case 1:
                                sc.nextLine();
                                System.out.print("Nhap vao ma giao dich: ");
                                String maGiaoDich = sc.nextLine();

                                System.out.print("Nhap vao ngay giao dich: ");
                                int ngay = sc.nextInt();
                                System.out.print("Nhap vao thang giao dich: ");
                                int thang = sc.nextInt();
                                System.out.print("Nhap vao nam giao dich: ");
                                int nam = sc.nextInt();
                                LocalDate ngayGiaoDich = LocalDate.of(nam, thang, ngay);

                                System.out.print("Nhap vao don gia: ");
                                double donGia = sc.nextDouble();

                                System.out.print("Nhap vao dien tich: ");
                                double dienTich = sc.nextDouble();

                                System.out.print("Nhap vao loai dat(A||B,C): ");
                                char loaiDat = sc.next().charAt(0);

                                GiaoDichDat gdd = new GiaoDichDat(loaiDat, maGiaoDich, ngayGiaoDich, donGia, dienTich);
                                dsgd.themGD(gdd);
                                break;
                            case 2:
                                sc.nextLine();
                                System.out.print("Nhap vao ma giao dich: ");
                                maGiaoDich = sc.nextLine();

                                System.out.print("Nhap vao ngay giao dich: ");
                                ngay = sc.nextInt();
                                System.out.print("Nhap vao thang giao dich: ");
                                thang = sc.nextInt();
                                System.out.print("Nhap vao nam giao dich: ");
                                nam = sc.nextInt();
                                ngayGiaoDich = LocalDate.of(nam, thang, ngay);

                                System.out.print("Nhap vao don gia: ");
                                donGia = sc.nextDouble();

                                System.out.print("Nhap vao dien tich: ");
                                dienTich = sc.nextDouble();

                                sc.nextLine();
                                System.out.print("Nhap vao loai nha(caocap||thuong): ");
                                String loaiNha = sc.nextLine();

                                System.out.print("Nhap vao dia chi: ");
                                String diaChi = sc.nextLine();

                                GiaoDichNha gdn = new GiaoDichNha(loaiNha, diaChi, maGiaoDich, ngayGiaoDich, donGia, dienTich);
                                dsgd.themGD(gdn);
                                break;
                            default:
                                if (menu_1 != 0) {
                                    System.out.println("Vui long nhap lai");
                                } else {
                                    System.out.println("Quay lai chuong trinh");
                                }
                        }
                    } while (menu_1 != 0);
                    break;
                case 2:
                    dsgd.inGD();
                    break;
                case 3:
                    dsgd.tinhsoluong();
                    break;
                case 4:
                    dsgd.trungbinhgddat();
                    break;
                case 5:
                    LocalDate ngayXuat = LocalDate.of(2022, 5, 24);
                    dsgd.xuatgiaodich(ngayXuat);
                    break;
                default:
                    if (menu != 0) {
                        System.out.println("Vui long nhap lai");
                    } else {
                        System.out.println("Thoat thanh cong");
                    }
            }
        } while (menu != 0);
    }

}
