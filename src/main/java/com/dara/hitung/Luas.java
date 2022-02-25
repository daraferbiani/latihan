package com.dara.hitung;

public class Luas {
    private double varPanjang, varLebar;
   public Luas(double p,double l){
       this.varPanjang = p;
       this.varLebar = l;
    }
    public double hitungLuas(double panjang, double lebar){
        return panjang*lebar;
    }

    public double hitungLuasdua(){
        return varLebar*varPanjang;
    }
}
