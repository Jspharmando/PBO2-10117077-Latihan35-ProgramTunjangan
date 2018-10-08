package com.company;

import java.util.Scanner;

/**
 *
 * @author Joseph Armando Carvallo
 */

public class ProgramTunjangan {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        Tunjangan gaji1 = new Tunjangan();

        System.out.println("===Program Tunjangan===");
        System.out.print("Beberapa gaji pokok Anda perbulan\t: ");
        gaji1.gajiAwal = inputan.nextDouble();
        System.out.print("Status Anda (menikah/belum)\t: " );
        gaji1.status = inputan.next();

        System.out.println("===Hasil Perhitungan===");
        System.out.println("Gaji Pokok\t: "+gaji1.gajiAwal);
        System.out.println("Tunjangan\t: "+gaji1.hitungTunjangan());
        System.out.println("Total Gaji\t: "+gaji1.hitungTotalGaji());
    }
}
