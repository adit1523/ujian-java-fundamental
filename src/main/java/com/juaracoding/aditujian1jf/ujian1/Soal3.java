package com.juaracoding.aditujian1jf.ujian1;

public class Soal3 {
    public static void main(String[] args) {
        int jmlTiket = 5;
        double diskon = 0.1;
        boolean isWeekday = false;
        int harga1 = isWeekday ? 35000 : 40000;
        int total = jmlTiket * harga1;

        if(jmlTiket > 5 ) {
            total -= total * diskon;
            System.out.println("Jumlah Tiket: "+ jmlTiket);
            System.out.println("Total harga (dengan diskon): "+ total);
        } else {
            System.out.println("Jumlah Tiket: "+ jmlTiket);
            System.out.println("Total harga: "+ total);
        }
    }
}
