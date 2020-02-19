/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programjajargenjang;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ProgramJajarGenjang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jajargenjang [] jg = new Jajargenjang[5];
        
        System.out.println("Menghitung luas dan keliling jajar genjang");  
        for (int i = 0; i < 5; i++) {
            jg[i] = new Jajargenjang();
            System.out.println("jajar genjang ke-" + (i+1));
            System.out.println("Masukkan alas : ");
            jg[i].alas = sc.nextInt();
            System.out.println("Masukkan tinggi : ");
            jg[i].tinggi = sc.nextInt();
            System.out.println("Masukkan miring : ");
            jg[i].miring = sc.nextInt();

            }  
        for (int i = 0;i < 5; i++) {
            System.out.println("jajar genjang ke-" + i);
            System.out.println("luas = " + jg[i].hitungluas());
            System.out.println("keliling" + jg[i].hitungKeliling());
        }
        }    
    }

