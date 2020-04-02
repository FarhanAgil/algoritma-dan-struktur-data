/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2;

/**
 *
 * @author ASUS
 */
public class Buku {
   String judul;
    int JumlahHalaman;
    double tinggiBuku;
    
    Buku(String j, int h, double t){
        judul = j;
        JumlahHalaman = h;
        tinggiBuku = t;
    }
    void tampil(){
        System.out.println("Judul = " + judul);
        System.out.println("Jumlah Halaman = " + JumlahHalaman);
        System.out.println("Ukuran Buku = " + tinggiBuku);
    }
}

