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
public class QuanLyBan {

    private List<Ban> ds = new ArrayList<>();

    public List<Ban> timKiem() {//tim kiem theo tinh trang 
        return this.ds.stream().filter(x -> x.isTinhTrang()).collect(Collectors.toList());
    }
    
    public List<Ban> timKiem(int n) {//tim kiem theo suc chua
        return this.ds.stream().filter(x -> x.getSucChua() == n).collect(Collectors.toList());
    }
    
    public Ban timKiemId(String id){
        for (Ban d : ds) {
            if(d.getMaBan().equals(id))
                return d;
        }
        return null;
    }
    
    public List<Ban> timKiem(String id){//tim kiem theo ma ban
        return this.ds.stream().filter(x -> x.getMaBan().equalsIgnoreCase(id)).collect(Collectors.toList());
    }

    public void themBan(int n) {
        for(int i=0; i<n; i++){
            System.out.printf("\nNhap ban thu %d\n",i+1);
            Ban b = new Ban();
            b.nhapBan();
            this.ds.add(b);
        }
    }

    public void themBan(Ban... b) {
        this.ds.addAll(Arrays.asList(b));
    }

    public void themBan(String tapTin) throws FileNotFoundException {
        File f = new File(tapTin);
        try(Scanner sc = new Scanner(f)){
            while(sc.hasNext()){
                Ban b=new Ban();
                b.setSucChua(sc.nextInt());
                b.setTinhTrang(sc.nextBoolean());
                this.ds.add(b);
            }
        }
    }

    public void capNhat(String id) {
        for(Ban b : ds){
            if(b.getMaBan().equalsIgnoreCase(id))
                b.nhapBan();
        }
    }

    public void xoaBan(String id) {
        Ban bFound = null;
        for(Ban b : getDs()){
            if(b.getMaBan().equalsIgnoreCase(id))
                bFound=b;
        }
        if(bFound!=null)
            this.ds.remove(bFound);
    }

    public void hienThi() {
        this.ds.forEach(b->b.hienThi());
    }

    /**
     * @return the ds
     */
    public List<Ban> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<Ban> ds) {
        this.ds = ds;
    }
    
}
