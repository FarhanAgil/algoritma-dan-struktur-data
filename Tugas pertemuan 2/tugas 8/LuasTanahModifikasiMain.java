/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luastanahmodifikasi;
import java.util.Scanner;
/**
 *Nama  : Moch Farchan Agil
 *Nim   : 1941720204 
 *kelas : 1F
 */
public class LuasTanahModifikasiMain {
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    LuasTanahModifikasi ls = new LuasTanahModifikasi();
    ls.control = 0;

    System.out.print("Masukkan jumlah tanah : ");
    ls.jumlah = input.nextInt();
		
    LuasTanahModifikasi[] tanah = new LuasTanahModifikasi[ls.jumlah];

    for (int i = 0; i < tanah.length ; i++) {
    tanah[i] = new LuasTanahModifikasi();
    
    System.out.print("\nMasukkan panjang Tanah ke-" + (i+1) + " : ");
    tanah[i].panjang = input.nextInt();
    System.out.print("Masukkan lebar Tanah ke-" + (i+1) + " : ");
    tanah[i].lebar = input.nextInt();

        }

    System.out.println();

    for (int i = 0; i < tanah.length ; i++) {
    System.out.println("Luas Tanah ke-" + (i+1) + " : " + ls.luasTanah(tanah[i].panjang , tanah[i].lebar));
		}

    ls.max = ls.luasTanah(tanah[0].panjang , tanah[0].lebar);

		
    for (int i = 0; i < tanah.length ; i++) {
    if (ls.luasTanah(tanah[i].panjang , tanah[i].lebar) > ls.max) {
    ls.max = ls.luasTanah(tanah[i].panjang , tanah[i].lebar);
    ls.control = i;
 			}
 		}

    System.out.println("\nTanah yang terluas adalah tanah ke-" + (ls.control+1));
 		


	}
}
