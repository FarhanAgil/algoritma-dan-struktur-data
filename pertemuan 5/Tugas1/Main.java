/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarHargaTiket data = new DaftarHargaTiket();
        int jmlTiket = 5;
        
        for(int i=0; i<jmlTiket; i++){
            System.out.println("************************************************");
            System.out.println("        INFORMASI TIKET PESAWAT PER MASKAPAI");
            System.out.println("************************************************");
        System.out.print("Nama Maskapai\t\t= ");
        String nama = s1.nextLine();
        System.out.print("Harga Tiket\t\t= Rp. ");
        float harga = sc.nextFloat();
        System.out.print("Transit Penerbangan\t= ");
        int transitCount = sc.nextInt();
        System.out.print("lama Penerbangan\t\t= ");
        int flightTime = sc.nextInt();
            System.out.println("*************************************************");
            System.out.println();
            
            Pesawat t = new Pesawat(nama, harga, transitCount, flightTime);
            data.tambah(t);
        }
        System.out.println("******************************************************");
        System.out.println(" DAFTAR HARGA TIKET PESAWAT PER MASKAPAI PENERBANGAN");
        System.out.println("******************************************************");
        data.tampil();
        
        System.out.println();
        System.out.println("******************************************************");
        System.out.println("        DAFTAR HARGA TIKET DENGAN BUBBLE SORT");
        System.out.println("******************************************************");
        data.bubbleSort();
        data.tampil();
        
        System.out.println();
        System.out.println("******************************************************");
        System.out.println("        DAFTAR HARGA TIKET DENGAN SELESCTION SORT");
        System.out.println("******************************************************");
        data.selectionSort();
        data.tampil();
    }
}

