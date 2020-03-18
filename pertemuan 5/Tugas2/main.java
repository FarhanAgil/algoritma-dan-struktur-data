/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ASUS
 */
public class main {
   public static void main(String[] args) {
        DaftarLiga data = new DaftarLiga();
        ligaInggris[] L = new ligaInggris[20];

        L[0] = new ligaInggris("Manchester United", 28, 12, 42);
        L[1] = new ligaInggris("Tottenham Hotspur", 29, 7, 41);
        L[2] = new ligaInggris("Arsenal", 28, 4, 40);
        L[3] = new ligaInggris("Burnley", 29, -6, 39);
        L[4] = new ligaInggris("Crystal Palace", 29, -6, 39);
        L[5] = new ligaInggris("Everton", 29, -6, 37);
        L[6] = new ligaInggris("Liverpool", 29, 45, 82);
        L[7] = new ligaInggris("Manchester City", 27, 39, 57);
        L[8] = new ligaInggris("Leicester", 28, 26, 50);
        L[9] = new ligaInggris("Newcastle United", 29, -16, 35);
        L[10] = new ligaInggris("Southampton", 29, -17, 34);
        L[11] = new ligaInggris("Brighton & Hove Albion", 29, -8, 29);
        L[12] = new ligaInggris("Chelsea", 29, 9, 48);
        L[13] = new ligaInggris("Wolverhampton Wanderers", 29, 7, 43);
        L[14] = new ligaInggris("Sheffield United", 28, 5, 43);
        L[15] = new ligaInggris("West Ham United", 29, -15, 27);
        L[16] = new ligaInggris("Watford", 29, -17, 27);
        L[17] = new ligaInggris("AFC Bournemouth", 29, -18, 27);
        L[18] = new ligaInggris("Aston Villa", 27, -18, 25);
        L[19] = new ligaInggris("Norwich City", 29, -27, 21);
        
        for (int i = 0; i < 20; i++) {
            data.tambah(L[i]);
        }
        
        System.out.println("Daftar Liga Inggris Sebelum Sorting : ");
        data.tampil();
        System.out.println();
        System.out.println("============================================");
        System.out.println("Daftar Liga Inggris Setelah Insertion Sort secara Asc : ");
        data.insertionSortA();
        data.tampil();
        System.out.println();
        System.out.println("============================================");
        System.out.println("Daftar Liga Inggris Setelah Insertion Sort secara Desc : ");
        data.insertionSortD();
        data.tampil();
    }
 
}

