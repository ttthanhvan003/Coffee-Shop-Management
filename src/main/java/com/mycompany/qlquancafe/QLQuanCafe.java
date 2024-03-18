/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.qlquancafe;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class QLQuanCafe {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        QuanLyBan qlb = new QuanLyBan();
        QuanLySanPham qlsp = new QuanLySanPham();
        QuanLyDatBan qldb = new QuanLyDatBan();
        Ban b1 = new Ban(6, true);
        Ban b2 = new Ban(2, false);
        Ban b3 = new Ban(1, true);
        Ban b4 = new Ban(4, true);
        Ban b5 = new Ban(3, false);
        Ban b6 = new Ban(2, true);
        qlb.themBan(b1,b2,b3,b4,b5,b6);
        Date d1 = new Date("1/12/2022");
        Date d2 = new Date("2/3/2022");
        Date d3 = new Date("3/9/2022");
        Date d4 = new Date("4/12/2022");
        Date d5 = new Date("5/22/2022");
        Date d6 = new Date("6/8/2022");
        Date d7 = new Date("7/5/2022");
        Date d8 = new Date("8/10/2022");
        Date d9 = new Date("9/9/2022");
        Date d10 = new Date("10/3/2022");
        Date d11 = new Date("11/5/2022");
        Date d12= new Date("12/9/2022");
        SanPham s1 = new ThucAn("com chien", "sang, trua", 10, 15000, "khong");
        SanPham s2 = new ThucUong("coca", "toi, sang, trua", 10, 25000, "co");
        SanPham s3 = new ThucAn("pho", "sang, trua", 10, 30000, "co");
        SanPham s4 = new ThucUong("cafe", "sang, trua, chieu", 100, 15000, "khong");
        SanPham s5 = new ThucUong("yaourt da", "sang, trua, toi", 10, 25000, "co");
        SanPham s6 = new ThucUong("nuoc cam", "sang, trua", 10, 30000, "co");
        SanPham s7 = new ThucAn("com chien", "sang", 10, 15000, "khong");
        SanPham s8 = new ThucUong("tra", "sang, trua, toi", 10, 25000, "co");
        SanPham s9 = new ThucAn("banh mi", "sang, trua", 10, 30000, "khong");
        SanPham s10 = new ThucUong("soda", "sang, trua, toi", 10, 15000, "khong");
        SanPham s11 = new ThucUong("sua tuoi", "sang, trua, toi", 15, 25000, "co");
        SanPham s12 = new ThucUong("da xay", "sang, trua, toi", 10, 30000, "co");
        qlsp.themSanPham(s1, s2, s3,s4,s5,s6,s7,s8,s9,s10,s11,s12);
        DatBan a1 = new DatBan(b1, d1);
        DatBan a2 = new DatBan(b3, d2);
        DatBan a3 = new DatBan(b4, d3);
        DatBan a4 = new DatBan(b5, d4);
        DatBan a5 = new DatBan(b6, d5);
        DatBan a6 = new DatBan(b2, d6);
        DatBan a7 = new DatBan(b1, d7);
        DatBan a8 = new DatBan(b3, d8);
        DatBan a9 = new DatBan(b4, d9);
        DatBan a10 = new DatBan(b5, d10);
        DatBan a11 = new DatBan(b5, d11);
        DatBan a12 = new DatBan(b2, d12);
        a1.themSp(s3, 2);
        a1.themSp(s2, 1);
        a2.themSp(s2, 2);
        a3.themSp(s3, 3);
        a4.themSp(s4, 1);
        a4.themSp(s9, 1);
        a5.themSp(s11, 2);
        a6.themSp(s3, 1);
        a6.themSp(s6, 1);
        a7.themSp(s12, 2);
        a7.themSp(s4, 4);
        a8.themSp(s9, 1);
        a9.themSp(s11, 5);
        a10.themSp(s1, 1);
        a11.themSp(s5, 5);
        a12.themSp(s5, 3);
        qldb.themDon(a1, a2, a3,a4,a5,a6,a7,a8,a9,a10,a11,a12);
        
        qlsp.themThucAn("src/main/resources/thucan.txt");
        qlsp.themThucUong("src/main/resources/thucuong.txt");
        qlnv.themNhanVien("src/main/resources/nhanvien.txt");
        qlb.themBan("src/main/resources/ban.txt");
        
        int chon;
        do {
            System.out.print("""
                            
                               -----------------------------------------------------------
                               |         MENU       
                               |1. Quan Ly Nhan Vien     
                               |2. Quan Ly Ban
                               |3. Quan Ly San Pham
                               |4. Dat Ban
                               |5. Thong Ke Doanh Thu
                               |0. Thoat!
                               ------------------------------------------------------------
                               """);
            System.out.print("Ban chon chuc nang: ");
            chon = Integer.parseInt(CauHinh.sc.nextLine());
            switch (chon) {
                case 1 -> {
                    int x;
                    do {
                        System.out.print("""
                                ---------------------------------------------------------
                                |         Quan Ly Nhan Vien
                                |1. Xem Danh Sach Nhan Vien
                                |2. Tra Cuu Nhan Vien
                                |3. Cap Nhat Thong Tin Nhan Vien
                                |4. Xem Danh Sach Nhan Vien Sinh Trong Thang Hien Tai
                                |0. Thoat!
                                ---------------------------------------------------------
                                                                    """);
                        System.out.print("Ban chon chuc nang: ");
                        x = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (x) {
                            case 1 ->
                                qlnv.hienThi();
                            case 2 -> {
                                int y;
                                do {
                                    System.out.print("""
                                            ---------------------------------------------------------
                                            |         Tra Cuu Nhan Vien
                                            |1. Tra Cuu Theo Ho Ten
                                            |2. Tra Cuu Theo Gioi Tinh
                                            |3. Tra Cuu Theo Ngay Sinh
                                            |4. Tra Cuu Theo Que Quan
                                            |0. Thoat!
                                            ---------------------------------------------------------
                                        """);
                                    System.out.print("Ban chon chuc nang: ");
                                    y = Integer.parseInt(CauHinh.sc.nextLine());
                                    switch (y) {
                                        case 1 -> {
                                            System.out.print("Ban nhap ho ten nhan vien can tim: ");
                                            String ht = CauHinh.sc.nextLine();
                                            qlnv.timKiemTheoHoTen(ht).forEach(n -> n.hienThi());
                                        }
                                        case 2 -> {
                                            System.out.print("Ban nhap gioi tinh nhan vien can tim: ");
                                            String gt = CauHinh.sc.nextLine();
                                            qlnv.timKiemTheoGioiTinh(gt).forEach(n -> n.hienThi());
                                        }
                                        case 3 -> {
                                            System.out.print("Ban nhap ngay sinh nhan vien can tim: ");
                                            Date d;
                                            d = CauHinh.f.parse(CauHinh.sc.nextLine());
                                            qlnv.timKiemTheoNgaySinh(d).forEach(n -> n.hienThi());
                                        }
                                        case 4 -> {
                                            System.out.print("Ban nhap que quan nhan vien can tim: ");
                                            String qq = CauHinh.sc.nextLine();
                                            qlnv.timKiemTheoQueQuan(qq).forEach(n -> n.hienThi());
                                        }
                                        case 0 ->
                                            System.out.println("Thoat!");
                                    }
                                } while (y != 0);
                            }
                            case 3 -> {
                                int z;
                                do {
                                    System.out.print("""
                                            ---------------------------------------------------------
                                            |         Cap Nhat Nhan Vien
                                            |1. Them Thong Tin Nhan Vien
                                            |2. Xoa Thong Tin Nhan Vien
                                            |3. Cap Nhat Thong Tin Nhan Vien
                                            |0. Thoat!
                                            ---------------------------------------------------------
                                            """);
                                    System.out.print("Ban chon chuc nang: ");
                                    z = Integer.parseInt(CauHinh.sc.nextLine());
                                    switch (z) {
                                        case 0:
                                            System.out.println("Thoat!");
                                            break;
                                        case 1:
                                            System.out.print("So luong nhan vien can them: ");
                                            int sl = Integer.parseInt(CauHinh.sc.nextLine());
                                            qlnv.themNhanVien(sl);
                                            break;
                                        case 2:
                                            int i;
                                            do {
                                                System.out.print("""
                                                        ---------------------------------------------------------
                                                        |         Xoa Thong Tin Nhan Vien
                                                        |1. Xoa Tat Ca
                                                        |2. Xoa Thong Tin Nhan Vien Theo Ma
                                                        |0. Thoat!
                                                        ---------------------------------------------------------
                                                        """);
                                                System.out.print("Ban chon chuc nang: ");
                                                i = Integer.parseInt(CauHinh.sc.nextLine());
                                                switch (i) {
                                                    case 1 -> {
                                                        qlnv.xoaNhanVien();
                                                        System.out.println("Da xoa toan bo nhan vien");
                                                    }
                                                    case 2 -> {
                                                        System.out.print("Nhap ma nhan vien can xoa: ");
                                                        int ma = Integer.parseInt(CauHinh.sc.nextLine());
                                                        qlnv.xoaNhanVien(ma);
                                                    }

                                                }
                                            } while (i != 0);
                                        case 3:
                                            System.out.print("Nhap ma nhan vien can cap nhat thong tin: ");
                                            int m = Integer.parseInt(CauHinh.sc.nextLine());
                                            qlnv.capNhat(m);
                                            break;
                                    }
                                } while (z != 0);
                            }
                            case 4 -> {
                                System.out.println("Danh Sach Nhan Vien Co Sinh Nhat Trong Thang Hien Tai:");
                                qlnv.sinhNhat().forEach(n -> n.hienThi());
                            }
                        }
                    } while (x != 0);
                }
                case 2 -> {
                    int y;
                    do {
                        System.out.print("""
                                ---------------------------------------------------------
                                |         Quan Ly Ban
                                |1. Xem Danh Sach Ban 
                                |2. Cap Nhat Thong Tin Ban
                                |3. Tim Kiem Ban Theo Suc Chua
                                |0. Thoat!
                                ---------------------------------------------------------
                                """);
                        System.out.print("Ban chon chuc nang: ");
                        y = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (y) {
                            case 0 ->
                                System.out.println("Thoat!");
                            case 1 -> {
                                int xem;
                                do {
                                    System.out.print("""
                                            ---------------------------------------------------------
                                            |         Xem Thong Tin Ban
                                            |1. Xem Danh Sach Ban Trong
                                            |2. Xem Tat Ca
                                            |0. Thoat!
                                            ---------------------------------------------------------
                                            """);
                                    System.out.print("Ban chon chuc nang: ");
                                    xem = Integer.parseInt(CauHinh.sc.nextLine());
                                    switch (xem) {
                                        case 0 ->
                                            System.out.println("Thoat!");
                                        case 1 ->
                                            qlb.timKiem().forEach(n -> n.hienThi());
                                        case 2 ->
                                            qlb.hienThi();
                                    }
                                } while (xem != 0);
                            }
                            case 2 -> {
                                int c;
                                do {
                                    System.out.print("""
                                            ---------------------------------------------------------
                                            |         Cap Nhat Thong Tin Ban
                                            |1. Them Thong Tin Ban
                                            |2. Cap Nhat Thong Tin Ban
                                            |3. Xoa Thong Tin Ban
                                            |0. Thoat!
                                            ---------------------------------------------------------
                                            """);
                                    System.out.print("Ban chon chuc nang: ");
                                    c = Integer.parseInt(CauHinh.sc.nextLine());
                                    switch (c) {
                                        case 0 ->
                                            System.out.println("Thoat!");
                                        case 1 -> {
                                            System.out.print("So ban can them: ");
                                            int b = Integer.parseInt(CauHinh.sc.nextLine());
                                            qlb.themBan(b);
                                        }
                                        case 2 -> {
                                            System.out.print("Nhap ma ban can cap nhat thong tin: ");
                                            String cn = CauHinh.sc.nextLine();
                                            qlb.capNhat(cn);
                                        }
                                        case 3 -> {
                                            System.out.print("Nhap ma ban can xoa thong tin: ");
                                            String xoa = CauHinh.sc.nextLine();
                                            qlb.xoaBan(xoa);
                                        }
                                    }
                                } while (c != 0);
                            }
                            case 3 -> {
                                System.out.print("Nhap suc chua can tim: ");
                                int s = Integer.parseInt(CauHinh.sc.nextLine());
                                qlb.timKiem(s).forEach(n -> n.hienThi());
                            }

                        }
                    } while (y != 0);
                }
                case 3 -> {
                    int c1;
                    do {
                        System.out.print("""
                                ---------------------------------------------------------
                                |         Quan Ly San Pham
                                |1. Xem Danh Sach San Pham
                                |2. Them San Pham
                                |3. Xoa San Pham
                                |4. Tim Kiem San Pham
                                |5. Sap Xep Danh Sach San Pham Theo Gia
                                |0. Thoat!
                                ---------------------------------------------------------
                                """);
                        System.out.print("Ban chon chuc nang: ");
                        c1 = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (c1) {
                            case 0 ->
                                System.out.println("Thoat!");
                            case 1 ->
                                qlsp.hienThi();
                            case 2 -> {
                                int c2;
                                do {
                                    System.out.print("""
                                            ---------------------------------------------------------
                                            |         Them Thong Tin San Pham
                                            |1. Them Thuc An
                                            |2. Them Thuc Uong
                                            |0. Thoat!
                                            ---------------------------------------------------------
                                            """);
                                    System.out.print("Ban chon chuc nang: ");
                                    c2 = Integer.parseInt(CauHinh.sc.nextLine());
                                    switch (c2) {
                                        case 0 ->
                                            System.out.println("Thoat!");
                                        case 1 -> {
                                            System.out.print("Nhap so thuc an can them: ");
                                            int ta = Integer.parseInt(CauHinh.sc.nextLine());
                                            qlsp.themThucAn(ta);
                                        }
                                        case 2 -> {
                                            System.out.print("Nhap so thuc uong can them: ");
                                            int tu = Integer.parseInt(CauHinh.sc.nextLine());
                                            qlsp.themThucUong(tu);
                                        }
                                    }
                                } while (c2 != 0);
                            }
                            case 3 -> {
                                int c3;
                                do {
                                    System.out.print("""
                                            ---------------------------------------------------------
                                            |         Xoa Thong Tin San Pham
                                            |1. Xoa Theo Ma
                                            |2. Xoa Tat Ca
                                            |0. Thoat!
                                            ---------------------------------------------------------
                                            """);
                                    System.out.print("Ban chon chuc nang: ");
                                    c3 = Integer.parseInt(CauHinh.sc.nextLine());
                                    switch (c3) {
                                        case 0 ->
                                            System.out.println("Thoat!");
                                        case 1 -> {
                                            System.out.print("Nhap ma san pham can xoa: ");
                                            int ma = Integer.parseInt(CauHinh.sc.nextLine());
                                            qlsp.xoaSanPham(ma);
                                        }
                                        case 2 ->
                                            qlsp.xoaSanPham();
                                    }
                                } while (c3 != 0);
                            }
                            case 4 -> {
                                int t;
                                do {
                                    System.out.print("""
                                            ---------------------------------------------------------
                                            |         Tim Kiem San Pham
                                            |1. Tim Kiem Theo Ten San Pham
                                            |2. Tim Kiem Theo Khoang Gia
                                            |0. Thoat!
                                            ---------------------------------------------------------
                                            """);
                                    System.out.print("Ban chon chuc nang: ");
                                    t = Integer.parseInt(CauHinh.sc.nextLine());
                                    switch (t) {
                                        case 0 ->
                                            System.out.println("Thoat!");
                                        case 1 -> {
                                            System.out.print("Nhap ten san pham can tim: ");
                                            String ten = CauHinh.sc.nextLine();
                                            qlsp.timKiem(ten).forEach(n -> n.hienThi());
                                        }
                                        case 2 -> {
                                            System.out.print("Nhap gia nho nhat: ");
                                            double min = Double.parseDouble(CauHinh.sc.nextLine());
                                            System.out.print("Nhap gia lon nhat: ");
                                            double max = Double.parseDouble(CauHinh.sc.nextLine());
                                            qlsp.timKiem(min, max).forEach(n -> n.hienThi());
                                        }
                                    }
                                } while (t != 0);
                            }
                            case 5 -> {
                                int sx;
                                do {
                                    System.out.print("""
                                                ---------------------------------------------------------
                                                |         Sap Xep San Pham Theo Gia
                                                |1. Sap Xep Tang Dan
                                                |2. Sap Xep Giam Dan
                                                |0. Thoat!
                                                ---------------------------------------------------------
                                                """);
                                    System.out.print("Ban chon chuc nang: ");
                                    sx = Integer.parseInt(CauHinh.sc.nextLine());
                                    switch (sx) {
                                        case 0 ->
                                            System.out.println("Thoat!");
                                        case 1 -> {
                                            System.out.println("Danh sach san pham tang dan theo gia:");
                                            qlsp.xepTang();
                                            qlsp.hienThi();
                                        }
                                        case 2 -> {
                                            System.out.println("Danh sach san pham giam dan theo gia:");
                                            qlsp.xepGiam();
                                            qlsp.hienThi();
                                        }
                                    }
                                } while (sx != 0);
                            }
                        }
                    } while (c1 != 0);
                }
                case 4 -> {
                    System.out.print("""
                            
                               -----------------------------------------------------------
                                |         Dat Ban
                               ------------------------------------------------------------
                               """);

                    System.out.print("Nhap ngay dat ban (dd/MM/yyyy) : ");
                    Date d = CauHinh.f.parse(CauHinh.sc.nextLine());
                    System.out.println("DANH SACH CAC BAN CON TRONG:");
                    qlb.timKiem().forEach(n -> n.hienThi());

                    System.out.print("Ban nhap ma ban: ");
                    String id = CauHinh.sc.nextLine();
                    if (qlb.timKiem(id).isEmpty()) {
                        System.out.println("Ma ban khong ton tai.");
                    }
                    if (!qlb.timKiem(id).isEmpty()) {
                        Ban b = qlb.timKiemId(id);
                        if (!qlb.timKiem().contains(b)) {
                            System.out.println("Ban da co nguoi dat.");
                        } else {
                            b.setTinhTrang(false);
                            DatBan dB = new DatBan(b, d);
                            
                            int r;
                            do {
                                System.out.println("DANH SACH CAC SAN PHAM CON HANG:");
                                qlsp.timKiem().forEach(n -> n.hienThi());
                                System.out.print("""
                                            ---------------------------------------------------------
                                            |         Chon San Pham
                                            |1. Chon San Pham Tiep Tuc
                                            |0. Thanh Toan
                                            ---------------------------------------------------------
                                            """);
                                System.out.print("Ban chon chuc nang: ");
                                r = Integer.parseInt(CauHinh.sc.nextLine());
                                switch (r) {
                                    case 0 ->
                                        System.out.println("Thanh Cong!");
                                    case 1 -> {

                                        System.out.print("Nhap ten san pham: ");
                                        String ten = CauHinh.sc.nextLine();
                                        if (qlsp.timKiem(ten).isEmpty()) {
                                            System.out.println("Ten san pham khong hop le");
                                        }
                                        if (!qlsp.timKiem(ten).isEmpty()) {
                                            SanPham sp = qlsp.timKiemTen(ten);
                                            if (!qlsp.timKiem().contains(sp)) {
                                                System.out.println("San pham da het hang!");
                                            } else {
                                                int sl;
                                                do {
                                                    System.out.print("Nhap so luong: ");
                                                    sl = Integer.parseInt(CauHinh.sc.nextLine());
                                                    if (sl > sp.getSoLuong()) {
                                                        System.out.println("San pham con it hon so luong yeu cau.");
                                                    }
                                                } while (sl > sp.getSoLuong());

                                                int slg = sp.getSoLuong() - sl;
                                                sp.setSoLuong(slg);
                                                dB.themSp(sp, sl);
                                                System.out.println("Dat san pham thanh cong");
                                            }
                                        }
                                    }
                                }
                            } while (r != 0);
                            dB.inHoaDon();      
                            qldb.themDon(dB);
                            break;
                        }
                    }
                }
                case 5 -> {
                    int tk;
                    do {
                        System.out.print("""
                                -----------------------------------------------------------
                                |         Thong Ke Doanh Thu
                                |1. Chon Khoang Thoi Gian Can Thong Ke
                                |0. Thoat!!!
                                ------------------------------------------------------------
                                """);
                        System.out.print("Ban chon chuc nang: ");
                        tk = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (tk) {
                            case 0 ->
                                System.out.println("Thoat!");
                            case 1 -> {
                                System.out.print("Nhap khoang thoi gian nho nhat: ");
                                Date day1 = CauHinh.f.parse(CauHinh.sc.nextLine());
                                System.out.print("Nhap khoang thoi gian lon nhat: ");
                                Date day2 = CauHinh.f.parse(CauHinh.sc.nextLine());
                                List<DatBan> tt = qldb.timKiem(day1, day2);
                                tt.forEach(n -> n.inHoaDon());
                                double tongTt = 0;
                                for (DatBan datBan : tt) {
                                    tongTt += datBan.thanhToan();
                                }
                                System.out.printf("TONG DOANH THU TRONG KHOANG THOI GIAN TREN LA: %.2f",tongTt);
                            }
                        }
                    } while (tk != 0);
                }
            }
        } while (chon != 0);
    }
}
