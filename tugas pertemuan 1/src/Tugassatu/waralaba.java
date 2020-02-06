/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugassatu;
import java.util.Scanner;
/**
 *
 * @author farhan
 * 
 */
public class waralaba {
    
        static Scanner input = new Scanner(System.in);
        static void tampil() {
        System.out.println("==============================================");
        System.out.println("                NUSANTARA Chicken             ");
        System.out.println("                  Cabang Suhat                ");
        System.out.println("==============================================");
        System.out.println("|  Daftar menu barang         Harga barang   |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|1.|Paket Chicken                            |");
        System.out.println("----------------------------------------------");
        System.out.println("|  |   >- Chicken A                |Rp.12000 |");
        System.out.println("|  |   >- Chicken B                |Rp.15000 |");
        System.out.println("|  |   >- Chicken C                |Rp.20000 |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|2.|Paket oke                                |");
        System.out.println("----------------------------------------------");
        System.out.println("|  |   >- oke A                    |Rp.10000 |");
        System.out.println("|  |   >- oke B                    |Rp.12000 |");
        System.out.println("|  |   >- oke C                    |Rp.15000 |");
        System.out.println("----------------------------------------------");
        }
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tampil();
        int belanjaan = 0,bayar, total, jumlah;
        String nama, barang;
        System.out.print("Masukkan nama\t\t\t: ");
        nama = input.nextLine();
        System.out.print("jenis barang yang di beli\t: ");
        barang = input.nextLine();
        System.out.print("Jumlah barang yang dibeli\t: ");
        jumlah = input.nextInt();
        switch(barang){
            case "Chicken a":
                belanjaan = 12000;
            break;
            case "Chicken b":
                belanjaan = 15000;
            break;
            case "Chicken c":
                belanjaan = 20000;
            break;
            case  "oke a" :
                    belanjaan = 10000;
            break;        
            case  "oke b" :
                    belanjaan = 12000;
            break;        
            case  "oke c" :
                    belanjaan = 15000;
            break;        
        }
        total = belanjaan * jumlah;
            {
        
        System.out.println("==================================================");
        System.out.println("Total Bayar\t\t\t: Rp." + total);
        System.out.println("==================================================");     
        System.out.println("===========================================");
        System.out.println("  TERIMA KASIH SUDAH MEMBELI DI TOKO KAMI  ");
        System.out.println("===========================================");
    }
        }
}
