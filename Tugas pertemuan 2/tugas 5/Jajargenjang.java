/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programjajargenjang;

/**
 *
 * @author farhan
 */
public class Jajargenjang {
    public int alas;
    public int tinggi;
    public int miring;

    
    public int hitungluas(){
        return alas*tinggi;
    }
    public int hitungKeliling(){
        return (2*alas)+(2*tinggi);
    }
    
}

