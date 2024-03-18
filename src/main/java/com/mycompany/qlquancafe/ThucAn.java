/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlquancafe;

/**
 *
 * @author PC
 */
public class ThucAn extends SanPham {

    private String anChay;

    public ThucAn() {

    }

    public ThucAn( String ten, String thoiDiemBan, int soLuong, double giaBan,String anChay) {
        super(ten, thoiDiemBan, soLuong, giaBan);
        this.anChay = anChay;
    }
    

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("\nAn chay: %s\n", this.anChay);
    }

    @Override
    public void nhapSp() {
        super.nhapSp();
        System.out.print("An chay(Co/Khong): ");
        this.anChay = CauHinh.sc.nextLine();
    }

    /**
     * @return the anChay
     */
    public String getAnChay() {
        return anChay;
    }

    /**
     * @param anChay the anChay to set
     */
    public void setAnChay(String anChay) {
        this.anChay = anChay;
    }

}
