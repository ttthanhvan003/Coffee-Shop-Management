/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlquancafe;

import java.text.ParseException;
import java.util.Date;


/**
 *
 * @author PC
 */
public class NhanVien {

    private static int dem;

    private int maNv = ++dem;

    private String hoTen;

    private String gioiTinh;

    private String queQuan;

    private Date ngaySinh;

    private Date ngayVaoLam;

    private String boPhan;

    public NhanVien(String hoTen, String gioiTinh, String queQuan, Date ngaySinh, Date ngayVaoLam, String boPhan) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhan = boPhan;
    }
    
    public NhanVien(String hoTen, String gioiTinh, String queQuan, String ngaySinh, String ngayVaoLam, String boPhan) throws ParseException {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh =CauHinh.f.parse(ngaySinh);
        this.ngayVaoLam = CauHinh.f.parse(ngayVaoLam);
        this.boPhan = boPhan;
    }

    public NhanVien() {

    }

    public void nhapNv() throws ParseException {
        System.out.print("Ho ten nhan vien: ");
        this.hoTen= CauHinh.sc.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh= CauHinh.sc.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngaySinh = CauHinh.f.parse(CauHinh.sc.nextLine());
        System.out.print("Que quan: ");
        this.queQuan = CauHinh.sc.nextLine();
        System.out.print("Ngay vao lam: ");
        this.ngayVaoLam = CauHinh.f.parse(CauHinh.sc.nextLine());
        System.out.print("Bo phan lam viec: ");
        this.boPhan = CauHinh.sc.nextLine();
    }
    
    

    public void hienThi() {
        System.out.printf("\nMa nhan vien: %d",this.maNv);
        System.out.printf("\nHo ten nhan vien: %s",this.hoTen);
        System.out.printf("\nGioi tinh: %s",this.gioiTinh);
        System.out.printf("\nNgay sinh: %s", CauHinh.f.format(ngaySinh));
        System.out.printf("\nQue quan: %s",this.queQuan);
        System.out.printf("\nNgay vao lam: %s", CauHinh.f.format(ngayVaoLam));
        System.out.printf("\nBo phan lam viec: %s\n",this.boPhan);
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the maNv
     */
    public int getMaNv() {
        return maNv;
    }

    /**
     * @param maNv the maNv to set
     */
    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayVaoLam
     */
    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    /**
     * @param ngayVaoLam the ngayVaoLam to set
     */
    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    /**
     * @return the boPhan
     */
    public String getBoPhan() {
        return boPhan;
    }

    /**
     * @param boPhan the boPhan to set
     */
    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

        

}
