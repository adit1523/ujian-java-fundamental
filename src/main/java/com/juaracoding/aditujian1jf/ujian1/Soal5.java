package com.juaracoding.aditujian1jf.ujian1;

public class Soal5 {
    public static void main(String[] args) {
        int[] harga = {50000, 60000, 70000, 80000, 90000};
        int total = 0;

        for (int i = 0; i < harga.length; i++) {
            System.out.println("Harga tiket film "+ (i + 1) + ": "+ harga[i]);
            total += harga[i];
        }
        System.out.println("Total harga tiket: "+ total);

    }
}
