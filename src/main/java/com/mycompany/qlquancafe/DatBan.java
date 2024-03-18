/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlquancafe;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


/**
 *
 * @author PC
 */
public class DatBan {

    private Ban ban;
    
    private ArrayList<SanPham> sp;
    
    private HashMap<SanPham, Integer> soLuong;

    private Date ngayLapHoaDon;

    
    
    public DatBan(Ban ban, Date ngayLapHoaDon) {
        this.ban = ban;
        this.sp = new ArrayList<>();
        this.soLuong = new HashMap<>();
        this.ngayLapHoaDon = ngayLapHoaDon;
    }
    
   public void themSp(SanPham s, int sl){
       sp.add(s);
       soLuong.put(s, sl);
   }
    
    public double thanhToan() {
        double tong=0;
        for(SanPham t : sp){
            tong += t.getGiaBan()*soLuong.get(t);
        }
        return tong;
        
    }
    
    public void inHoaDon(){
        System.out.printf("\nHoa Don Cua Ban %s\n",ban.getMaBan());
        System.out.print("Ngay lap hoa don: "+this.ngayLapHoaDon);
        System.out.println("-----------------------------");
        for(SanPham t : sp ){
            int sl = soLuong.get(t);
            double gia = t.getGiaBan();
            double tongGia = gia*sl;
            System.out.printf("%s x %d : %.2f VND\n", t.getTen(),sl,tongGia);
        }
        System.out.printf("Tong hoa don: %.2f VND\n",thanhToan());
    }

    public DatBan() {
        
    }

    /**
     * @return the ngayLapHoaDon
     */
    public Date getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    /**
     * @param ngayLapHoaDon the ngayLapHoaDon to set
     */
    public void setNgayLapHoaDon(Date ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    /**
     * @return the ban
     */
    public Ban getBan() {
        return ban;
    }

    /**
     * @param ban the ban to set
     */
    public void setBan(Ban ban) {
        this.ban = ban;
    }

    /**
     * @return the sp
     */
    public ArrayList<SanPham> getSp() {
        return sp;
    }

    /**
     * @param sp the sp to set
     */
    public void setSp(ArrayList<SanPham> sp) {
        this.sp = sp;
    }

    /**
     * @return the soLuong
     */
    public HashMap<SanPham, Integer> getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(HashMap<SanPham, Integer> soLuong) {
        this.soLuong = soLuong;
    }
    
    

}
