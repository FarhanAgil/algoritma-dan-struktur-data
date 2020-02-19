/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;
import java.util.Scanner;
/**
 *Nama  : Moch Farchan Agil
 *Nim   : 1941720204 
 *kelas : 1F
 */
public class NilaiMahasiswaMain {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    NilaiMahasiswa nl = new NilaiMahasiswa();

    System.out.print("\nMasukkan jumlah mahasiswa : ");
    nl.jumlah = input.nextInt();

    NilaiMahasiswa[] nilai = new NilaiMahasiswa[nl.jumlah];

    for (int i = 0; i < nilai.length ; i++) {
    nilai[i] = new NilaiMahasiswa();

    System.out.println("\nMahasiswa ke-" + (i+1) + " : ");
    System.out.print("Masukkan Nilai ke 1 : ");
    nilai[i].nilai1 = input.nextInt();
    System.out.print("Masukkan Nilai ke 2 : ");
    nilai[i].nilai2 = input.nextInt();
		}

    System.out.println();

    for (int i = 0; i < nilai.length ; i++) {
    System.out.println("Nilai Terbaik Mahasiswa ke-" + (i+1) + " : " + nl.max(nilai[i].nilai1 , nilai[i].nilai2));
		}


	}
}
