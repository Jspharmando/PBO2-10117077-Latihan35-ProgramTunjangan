package com.company;

/**
 *
 * @author Joseph Armando Carvallo
 */

public class Tunjangan {
    public double gajiAwal;
    public String status;
    public double tunjangan;

    public double hitungTunjangan(){
        tunjangan = (status.equals("menikah"))? 0.35*gajiAwal:0;
        return tunjangan;
    }
    public double hitungTotalGaji(){
        return gajiAwal + tunjangan;
    }
}
