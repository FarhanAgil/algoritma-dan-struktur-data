/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSearching;

/**
 *
 * @author ASUS
 */
public class SearchingMain {
    public static void main(String[] args) {
        int data[] = {10, 30, 40, 50, 60, 70, 80, 90};
    
        Searching pencarian = new Searching(data,8);
        int cari = 30;
        
        System.out.println("ISI ARRAY");
        pencarian.TampilData();
        
        System.out.println("Sequential search");
        int posisi = pencarian.FindseqSearch(cari);
        if(posisi != -1){
        System.out.println("Data : " + cari + " Ditemukan pada indeks " + posisi );
        
    }else{
            System.out.println("Data " + cari + "tidak ditemukan");
            }
        pencarian.tampilposisi(cari, posisi); 
        System.out.println("=========================");
        
        System.out.println("Menggunakan binary search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.tampilposisi(cari, posisi);
    }
    
    
}
