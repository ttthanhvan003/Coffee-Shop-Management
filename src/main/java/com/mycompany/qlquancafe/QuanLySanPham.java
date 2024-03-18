/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlquancafe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author PC
 */
public class QuanLySanPham {

    private List<SanPham> ds = new ArrayList<>();

    public void themSanPham(SanPham... s) {
        this.ds.addAll(Arrays.asList(s));
    }

    public void themThucAn(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap san pham (thuc an) thu %d: \n", i + 1);
            SanPham a = new ThucAn();
            a.nhapSp();
            this.ds.add(a);
        }
    }

    public void themThucUong(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap san pham (thuc uong) thu %d:\n", i + 1);
            SanPham u = new ThucUong();
            u.nhapSp();
            this.ds.add(u);
        }
    }

    public void themThucAn(String tapTin) throws FileNotFoundException {
        File f = new File(tapTin);
        try ( Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                ThucAn a = new ThucAn();
                a.setTen(sc.nextLine());
                a.setThoiDiemBan(sc.nextLine());
                a.setSoLuong(Integer.parseInt(sc.nextLine()));
                a.setGiaBan(Double.parseDouble(sc.nextLine()));
                
//                a.setTinhTrang(sc.nextLine());
                a.setAnChay(sc.nextLine());
                this.ds.add(a);
            }
        }
    }

    public void themThucUong(String tapTin) throws FileNotFoundException {
        File f = new File(tapTin);
        try ( Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                ThucUong u = new ThucUong();
                u.setTen(sc.nextLine());
                u.setThoiDiemBan(sc.nextLine());
                u.setSoLuong(Integer.parseInt(sc.nextLine()));
                u.setGiaBan(Double.parseDouble(sc.nextLine()));
//                u.setTinhTrang(sc.nextLine());
                u.setDa(sc.nextLine());
                this.ds.add(u);
            }
        }
    }

    public List<SanPham> timKiem(String tuKhoa) {//tim kiem theo ten san pham
        return this.ds.stream().filter(x -> x.getTen().equalsIgnoreCase(tuKhoa)).collect(Collectors.toList());
    }
    
    public SanPham timKiemTen(String ten){
        for(SanPham sp : ds){
            if(sp.getTen().equalsIgnoreCase(ten))
                return sp;
        }
        return null;
    }

    public List<SanPham> timKiem(double min, double max) {//tim kiem theo khoang gia
        return this.ds.stream().filter(x -> (min <= x.getGiaBan() && x.getGiaBan() <= max)).collect(Collectors.toList());
    }
    
//    public List<SanPham> timKiem(int id){
//        
//    }
//    
//    public List<SanPham> timKiemTheoTinhTrang(String tt) {//tim kiem theo tinh trang san pham
//        return this.ds.stream().filter(x -> x.isTinhTrang()).collect(Collectors.toList());
//    }
    
    public List<SanPham> timKiem(){// tim kiem theo tinh trang
        return this.ds.stream().filter(x -> x.isTinhTrang()).collect(Collectors.toList());
    }

    public void xepGiam() {
        this.ds.sort((s1, s2) -> {
            double g1 = s1.getGiaBan();
            double g2 = s2.getGiaBan();
            return -(g1 > g2 ? 1 : (g1 < g2 ? -1 : 0));
        });
    }
    
    public void xepTang() {
        this.ds.sort((s1, s2) -> {
            double g1 = s1.getGiaBan();
            double g2 = s2.getGiaBan();
            return (g1 > g2 ? 1 : (g1 < g2 ? -1 : 0));
        });
    }

    public void hienThi() {
        this.ds.forEach(n -> n.hienThi());
    }

    public void xoaSanPham(int id) {
        SanPham spFound = null;
        for (SanPham s : getDs()) {
            if (s.getMaSp() == id) {
                spFound = s;
            }
        }
        if (spFound != null) {
            this.ds.remove(spFound);
        }
    }

    public void xoaSanPham(SanPham... s) {
        this.ds.removeAll(Arrays.asList(s));
    }

    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }

    

}
