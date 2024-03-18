/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlquancafe;

//import java.util.List;

/**
 *
 * @author PC
 */
public class Ban {

    private static int dem;

    private String maBan;

    private int sucChua;

    private boolean tinhTrang;
    

    {
        setMaBan(String.format("B%03d", ++dem));
    }

    public Ban(int sucChua, boolean tinhTrang) {
        this.sucChua = sucChua;
        this.tinhTrang = tinhTrang;
    }

    public Ban() {

    }

    public void nhapBan() {
        System.out.print("Nhap suc chua: ");
        this.sucChua=Integer.parseInt(CauHinh.sc.nextLine());
        System.out.print("Nhap tinh trang(true:trong/false:khong trong): ");
        this.setTinhTrang(CauHinh.sc.nextBoolean());
    }

    public void hienThi() {
        System.out.printf("\nMa ban: %s",this.maBan);
        System.out.printf("\nSuc chua: %d",this.sucChua);
        System.out.print("\nTinh trang: ");
        if(this.tinhTrang)
            System.out.print("Con trong\n");
        else
            System.out.print("Da duoc dat\n");
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
     * @return the maBan
     */
    public String getMaBan() {
        return maBan;
    }

    /**
     * @param maBan the maBan to set
     */
    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    /**
     * @return the sucChua
     */
    public int getSucChua() {
        return sucChua;
    }

    /**
     * @param sucChua the sucChua to set
     */
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    /**
     * @return the tinhTrang
     */
    public boolean isTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    

}
