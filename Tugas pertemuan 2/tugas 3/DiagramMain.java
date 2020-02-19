/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;
import java.util.Scanner;
/**
 *Nama  : Moch Farchan Agil
 *Nim   : 1941720204 
 *kelas : 1f
 */
public class DiagramMain {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Persewaan Motor ");

    Diagram dg = new Diagram();

    Diagram[] sewa = new Diagram[2];
    sewa[0] = new Diagram();
    sewa[0].id =  1487;
    sewa[0].motor = "Vespa matic";
    sewa[0].harga = 150000;

    sewa[1] = new Diagram();
    sewa[1].id = 1458;
    sewa[1].motor = "Ninja 250";
    sewa[1].harga = 125000;

    System.out.print("Masukkan nama anda : ");
    dg.nama = input.nextLine();

    System.out.println("Motor");
    for (int i = 0; i < sewa.length ; i++) {
    System.out.println((i+1) + ".) " + sewa[i].motor );
		}

    System.out.print("Masukkan pilihan : ");
    dg.select = input.nextInt();

    if (dg.select > 0 && dg.select <= (sewa.length)) {
			
    System.out.print("Sewa berapa hari : ");
    dg.hari = input.nextInt();

    System.out.println("\nData : ");
    System.out.println("id\t\t = " + sewa[(dg.select-1)].id);
    System.out.println("Nama\t\t = " + dg.nama);
    System.out.println("Game\t\t = " + sewa[(dg.select-1)].motor);
    System.out.println("Lama Pinjam\t = " + dg.hari + " Hari ");
    System.out.println("Harga\t\t = " + (sewa[(dg.select-1)].harga * dg.hari));
			

        }else{
	System.exit(0);
		}



	}
}
