/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlquancafe;

/**
 *
 * @author PC
 */
public class ThucUong extends SanPham {

	private String da;

	public ThucUong() {

	}
        
        

    public ThucUong( String ten, String thoiDiemBan, int soLuong, double giaBan,String da) {
        super(ten, thoiDiemBan, soLuong, giaBan);
        this.da = da;
    }
        
    
        @Override
	public void hienThi() {
            super.hienThi(); 
            System.out.printf("\nDa: %s\n", this.da);
	}

        @Override
	public void nhapSp() {
            super.nhapSp();
            System.out.print("Da(Co/Khong): ");
            this.setDa(CauHinh.sc.nextLine());
	}
        
        

    /**
     * @return the da
     */
    public String getDa() {
        return da;
    }

    /**
     * @param da the da to set
     */
    public void setDa(String da) {
        this.da = da;
    }
        

}
