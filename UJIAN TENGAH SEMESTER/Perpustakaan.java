/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2;

/**
 *
 * @author ASUS
 */
public class Perpustakaan {
    Buku listBuku[] = new Buku[4];
    int idx;

    void tambah(Buku b){
        if(idx<listBuku.length){
            listBuku[idx] = b;
            idx++;
        } else{
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampil(){
        for(Buku n : listBuku){
            n.tampil();
            System.out.println();
        }
    }
    void bubleSort(){
        for(int i=0; i<listBuku.length-1; i++){
            for(int j=1; j<listBuku.length-i; j++){
                if(listBuku[j].JumlahHalaman > listBuku[j-1].JumlahHalaman){
                    Buku tmp = listBuku[j];
                    listBuku[j] = listBuku[j-1];
                    listBuku[j-1] = tmp;
                }
            }
        }
    }
        
    void selectionSort() {
        for (int i = 0; i < listBuku.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listBuku.length; j++) {
                if (listBuku[j].tinggiBuku < listBuku[idxMin].tinggiBuku) {
                    idxMin = j;
                }
            }
            Buku tmp = listBuku[idxMin];
            listBuku[idxMin] = listBuku[i];
            listBuku[i] = tmp;
        }
    }
}

   