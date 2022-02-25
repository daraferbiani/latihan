package com.dara.hitung;

import org.springframework.stereotype.Component;

    @Component
    public class LuasImpldua implements LuasService{
        @Override
        public double hitungLuas(double panjang, double lebar) {
            return (panjang*lebar)/2;
        }

        @Override
        public double hitungLuasdua() {
            return 0;
        }
    }
