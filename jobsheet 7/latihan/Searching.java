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
public class Searching {
    public int [] data;
    public int jmlData;

public Searching(int [] Data, int jumData) {
    this.jmlData = jumData;
    data = new int[jumData];
    for (int i=0; i<jmlData; i++) {
       data[i] = Data[i];    
    }    
}
public int FindseqSearch(int cari){
  int posisi = -1;
  for (int j=0; j<jmlData; j++){
      if(data[j] == cari){
          posisi = j;
          break;
    }
  }
return posisi;
}
public void TampilData(){
    for (int i=0; i<jmlData; i++){
        System.out.print(data[i] + "");
        System.out.print("");
    }
    System.out.println();
}
public int FindBinarySearch (int cari,int left,int right){
int mid;
if (right >= left){
   mid = (left + right) /2;
   if (cari==data[mid]){
       return(mid);
       
   }else if(data[mid] > cari){
       return FindBinarySearch (cari, left, mid -1);
   }else {
       return FindBinarySearch (cari, mid +1, right);
   }
    }
return -1;
}
    

public void tampilposisi(int x,int pos){
    if(pos != -1){
        System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        
    }else{
        System.out.println("data " + x + "tidak ditemukan");
    }
}
}



    