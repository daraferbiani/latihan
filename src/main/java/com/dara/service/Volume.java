package com.dara.service;


import com.dara.hitung.LuasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Volume implements VolumeService {

    @Autowired
    private LuasService luasService;

    @Override
    public double hitungvolume(double panjang, double lebar, double tinggi){
        return luasService.hitungLuas(panjang,lebar)*tinggi;
    }

}
