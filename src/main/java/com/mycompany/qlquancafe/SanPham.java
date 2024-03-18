/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlquancafe;


/**
 *
 * @author PC
 */
public abstract class SanPham {
    
    private static int dem;
    
    private int maSp=++dem;

    private String ten;

    private String thoiDiemBan;

    private boolean tinhTrang;
    
    private int soLuong;

    private double giaBan;


    public SanPham(String ten, String thoiDiemBan, int soLuong, double giaBan) {
        this.ten = ten;
        this.thoiDiemBan = thoiDiemBan;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public SanPham(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    

    public SanPham() {

    }

    public void hienThi() {
        System.out.printf("\nMa san pham: %d",this.maSp);
        System.out.printf("\nTen san pham: %s",this.ten);
        System.out.printf("\nThoi diem ban: %s",this.thoiDiemBan);
        System.out.printf("\nGia ban: %.1f",this.giaBan);
//        System.out.printf("\nSo luong con lai: %d", this.getSoLuong());
        System.out.print("\nTinh trang: ");
        if(this.tinhTrang = this.soLuong>0)
            System.out.print("con hang");
        else
            System.out.print("het hang");
    }

    public void nhapSp() {
        System.out.print("Ten san pham: ");
        this.ten=CauHinh.sc.nextLine();
        System.out.print("Thoi diem ban(Sang/Trua/Toi): ");
        this.thoiDiemBan=CauHinh.sc.nextLine();
        System.out.print("Gia ban: ");
        this.giaBan=Double.parseDouble(CauHinh.sc.nextLine());
        System.out.print("Nhap so luong con lai: ");
        this.soLuong= Integer.parseInt(CauHinh.sc.nextLine());
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the thoiDiemBan
     */
    public String getThoiDiemBan() {
        return thoiDiemBan;
    }

    /**
     * @param thoiDiemBan the thoiDiemBan to set
     */
    public void setThoiDiemBan(String thoiDiemBan) {
        this.thoiDiemBan = thoiDiemBan;
    }

   

    /**
     * @return the giaBan
     */
    public double getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    /**
     * @return the maSp
     */
    public int getMaSp() {
        return maSp;
    }

    /**
     * @param maSp the maSp to set
     */
    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    /**
     * @return the tinhTrang
     */
    public boolean isTinhTrang() {
        return this.soLuong > 0;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    

    

    
    
    

}
