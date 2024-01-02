package semester3;

import java.util.Random;

public class latihanfunction {
    public static int[][] array(int[][] a){
        Random rand= new Random(); 
        for (int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){  
               a[i][j]=rand.nextInt(10); 
             
            }
            
    }
         return a;
    }
    public static void main(String[]args){
   int[][] a = new int[3][3]; 
    array(a);
    System.out.print(array (a)+" ");
}
}
 