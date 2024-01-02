
package semester3;

import java.util.Scanner;

public class TugasArray {
    public static void main (String[]args){
        // Inisialisasi langsung dengan nilai awal:
        int[] nim = {10,82,34,28,21,67,78,98,92}; 
        
        //Mengganti nilai elemen array.
        nim[2]= 20; 
       
        //Menampilkan isi array index ke6
        System.out.println("nim ke5 adalah: "+nim[6]);  
     
        // perulangan (loop) untuk mengakses elemen-elemen array
       for (int i=0; i<nim.length;i++){     
          System.out.println("nim :"+nim[i]);
      }

       //Inisialisasi secara terpisah dengan menetapkan nilai ke setiap elemen:
        String[] nama = new String[12]; 
        nama[0] = "shogun";     
        nama[1] = "amber";     
        nama[2] = "bennet";
        nama[3] = "eula";
        nama[4] = "kazuha";
        nama[5] = "lisa";
        nama[6] = "keqing";
        nama[7] = "barbara";
        nama[8] = "paimon";
        nama[9] = "ganyu";
        nama[10] = "ayaka";
        nama[11] = "hu tao";
         System.out.println("Nama Hero Genshin Impact");
        
         // pernyataan for-each (enhanced for loop) untuk iterasi.
         for (String i : nama){     
        System.out.println(i);
    }
         Scanner scanner = new Scanner(System.in);
         
         // Inisialisasi dengan ukuran tetapi tanpa nilai awal:
        char[] huruf= new char[10];
        
        for (char  i : huruf){   
        System.out.println("masukkan huruf random :");
        }
      }
    
   }
