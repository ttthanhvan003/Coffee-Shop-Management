/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlquancafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author PC
 */
public class QuanLyDatBan {

    private List<DatBan> ds = new ArrayList<>();

    public void themDon(DatBan... order) {
        ds.addAll(Arrays.asList(order));
    }
    
    public void hienThi(){
        this.ds.forEach(x->x.inHoaDon());
    }


    public double tongDoanhThu() {
        double kq = 0;
        for (DatBan order : ds) {
            kq += order.thanhToan();
        }
        return kq;
    }

    public List<DatBan> timKiem(Date d1, Date d2) {
        return this.ds.stream().filter(x -> ((x.getNgayLapHoaDon().equals(d1) || x.getNgayLapHoaDon().equals(d2)) || (x.getNgayLapHoaDon().after(d1) && x.getNgayLapHoaDon().before(d2)))).collect(Collectors.toList());
    }
}
