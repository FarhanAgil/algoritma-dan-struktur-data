/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programlingkaran;

/**
 *
 * @author ASUS
 */
public class ProgramLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        
        l1.r = 7;
        
        System.out.println("Luas lingkaran : " + l1.hitungLuas());
        System.out.println("Keliling lingkaran : " + l1.hitungKeliling());
    }
    
}
