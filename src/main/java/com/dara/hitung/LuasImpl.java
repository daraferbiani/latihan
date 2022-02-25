package com.dara.hitung;

import org.springframework.stereotype.Component;

public class LuasImpl implements LuasService{
    @Override
    public double hitungLuas(double panjang, double lebar) {
        return (panjang*lebar)/3;
    }

    @Override
    public double hitungLuasdua() {
        return 0;
    }
}
