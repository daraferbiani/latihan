package com.dara;


import com.dara.data.MasterData;
import com.dara.model.Departement;
import com.dara.service.VolumeService;
import facade.Konfigurasi;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class LatihanJava {

    private static String param;

    public String tes(String param, int nilai){
        return nilai+ " ==> "+param;
    }
    public int nilai(){
        return 0;
    }

    public static void main(String[] args) {
        LatihanJava LatihanJava = new LatihanJava();
        /*System.out.println(args[0]+" = "+args[1]);
        System.out.println(" test "+ LatihanJava.tes("parameter",10));

        Luas luas = new Luas(30, 45);
        System.out.println(" luas "+luas.hitungLuas(20,30 ));
        System.out.println(" luas dua "+luas.hitungLuasdua());

        LuasService luasService = new LuasImpl();
        System.out.println(" luas luasService "+luasService.hitungLuas(23, 50));

         */

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(Konfigurasi.class);
        ctx.refresh();
        VolumeService luasService1 = ctx.getBean(VolumeService.class);
        System.out.println(" Vol= "+luasService1.hitungvolume(23,50, 10));

        MasterData masterData = ctx.getBean(MasterData.class);
        MasterData.getKonek();
        List<Departement> listData = masterData.getDepList();
        for (int i = 0; i< listData.size(); i++){
            System.out.println(listData.get(i).getName()+" : "+ listData.get(i).getId());
        }


    }

}
