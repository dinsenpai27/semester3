package semester3;

import java.util.Random;
import java.util.Scanner;

public class Semester3 {

    public static void main(String[] args) {
        int v = 9; //tipe data tunggal
        int[] v_array={0,2,4,8,10};// tipe data array 
        
        int[] v_input=new int[11];//0-10
        
        v_input[2]=34;
        
        for (int i=0; i<=10;i++)
        {
            v_input[i] = i*2;            
        }
        
        for (int i=0; i<=10;i++)
        {
            System.out.println("Nilai : "+ v_input[i]);            
        }

        Random input = new Random(0);
        for (int i=0; i<=10;i++)
        {
            v_input[i] = input.nextInt(20);
        }
        
        for (int i=0; i<=10;i++)
        {
            System.out.println("Nilai : "+ v_input[i]);            
        }
        
        Scanner baca = new Scanner(System.in);
        
        String[] inisial=new String[10];
        for (int i=0; i<=9;i++)
        {
            System.out.print("Karakter Ke "+i+" :");
            inisial[i]=baca.next();
            System.out.println();
        }
        
        System.out.print("Karakter Yang dimasukkan adalah :");
        for (int i=0; i<=9;i++)
        {
            System.out.print(" "+ inisial[i]);            
        }
        
         System.out.println();            
       
        String[] v_string_array ={"Ayu", "Dewi","Farah","Zahrah","Citra"};
        double[] biaya = new double[5];
        
        System.out.println("Masukkan Biaya Kamar :");
        for (int i=0; i<=4;i++)
        {
            System.out.print("Biaya Kamarnya "+v_string_array[i]+" :");
            biaya[i]=baca.nextDouble();
        }
        
        System.out.print("Biaya untuk masing2 Kamar yang dimasukkan :");
        for (int i=0; i<=4;i++)
        {
            System.out.println((i+1)+". "+v_string_array[i]+"="+ biaya[i]);            
        }
        
        
        System.out.println("Memanggil dengan inputan Random");            
        int i = input.nextInt(5);
        System.out.println((i+1)+". "+v_string_array[i]+"="+ biaya[i]);            
       
        
        
    }
    
}
