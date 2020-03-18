/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *Nama  : Moch Farchan Agil
 *Kelas : TI 1F
 *NIM   : 1941720204
 */
public class Pesawat {
    public String Maskapai;
    public float harga;
    public int transitCount;
    public int flightTime;
    
    public Pesawat(String mk, float hg, int tc, int ft){
       Maskapai = mk;
         harga = hg;
          transitCount = tc;
           flightTime = ft;
    }
    
    public void tampil(){
        System.out.println("Nama Maskapai\t\t= " + Maskapai);
        System.out.println("Harga Tiket\t\t= Rp. " + harga);
        System.out.println("Transit Penerbangan\t= " + transitCount);
        System.out.println("Jam Penerbangan\t\t= " + flightTime);
    }
}

