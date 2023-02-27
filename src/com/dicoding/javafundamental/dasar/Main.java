package com.dicoding.javafundamental.dasar;

import com.dicoding.javafundamental.dasar.kendaraan.Kereta;
import com.dicoding.javafundamental.dasar.kendaraan.Mobil;
import com.dicoding.javafundamental.dasar.kendaraan.Motor;
import com.dicoding.javafundamental.dasar.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Gitar.bunyi();
        Kereta.jumlahBan();
        Mobil.jumlahBan();
        Motor.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);
    }
}
