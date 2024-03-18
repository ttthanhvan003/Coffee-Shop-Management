/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlquancafe;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author PC
 */
public class QuanLyNhanVien {

    private List<NhanVien> ds = new ArrayList<>();

    public void themNhanVien(NhanVien... n) {
        this.ds.addAll(Arrays.asList(n));
    }

    public void themNhanVien(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            System.out.printf("\nNhap nhan vien thu %d\n", i + 1);
            NhanVien nv = new NhanVien();
            nv.nhapNv();
            this.ds.add(nv);
        }
    }

    public void themNhanVien(String tapTin) throws FileNotFoundException, ParseException {
        File f = new File(tapTin);
        try(Scanner sc = new Scanner(f)){
            while(sc.hasNext()){
                NhanVien n = new NhanVien();
                n.setHoTen(sc.nextLine());
                n.setGioiTinh(sc.nextLine());
                n.setQueQuan(sc.nextLine());
                n.setNgaySinh(CauHinh.f.parse(sc.nextLine())); //parse tu chuoi thanh ngay <kieu date>
                n.setNgayVaoLam(CauHinh.f.parse(sc.nextLine()));
                n.setBoPhan(sc.nextLine());
                this.ds.add(n);
            }
        }
    }
    
    public List<NhanVien> timKiemTheoNgaySinh(Date d){
        return this.ds.stream().filter(x -> x.getNgaySinh().getDate()==d.getDate()).collect(Collectors.toList());
    }

    public List<NhanVien> timKiemTheoHoTen(String tuKhoa) {
        return this.ds.stream().filter(x -> x.getHoTen().contains(tuKhoa)).collect(Collectors.toList());
    }

    public List<NhanVien> timKiemTheoGioiTinh(String tuKhoa) {
        return this.ds.stream().filter(x -> x.getGioiTinh().equals(tuKhoa)).collect(Collectors.toList());
    }

    public List<NhanVien> timKiemTheoQueQuan(String tuKhoa) {
        return this.ds.stream().filter(x -> x.getQueQuan().equals(tuKhoa)).collect(Collectors.toList());
    }

    public List<NhanVien> timKiemTheoMa(int id) {
        return this.ds.stream().filter(x -> x.getMaNv()==id).collect(Collectors.toList());
    }

    public List<NhanVien> sinhNhat() {
        Date d = new Date(System.currentTimeMillis());
        return this.ds.stream().filter(x -> x.getNgaySinh().getMonth()==d.getMonth()).collect(Collectors.toList());
    }

    public void capNhat(int id) throws ParseException {
        for(NhanVien n : ds){
            if(n.getMaNv()==id)
                n.nhapNv();
        }
    }

    public void xoaNhanVien(int id) {
        NhanVien nvFound = null;
        for(NhanVien n : ds){
            if(n.getMaNv()==id)
                nvFound=n;
        }
        if(nvFound!=null)
            this.ds.remove(nvFound);

    }
    
    public void xoaNhanVien(NhanVien...n){
        this.ds.removeAll(Arrays.asList(n));
    }

    public void hienThi() {
        this.ds.forEach(n->n.hienThi());
    }
}
