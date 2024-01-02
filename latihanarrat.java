
package semester3;

import java.util.Random;

public class latihanarrat {
    
    public static void main (String args[]){
        int[][] a= new int[10][10];
        Random rand= new Random();  
        
       System.out.println("Matrix A");
       
        for (int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){  
               a[i][j]=rand.nextInt(10); 
               
                System.out.print(a[i][j]+" "); 
            }
          System.out.println(); 
    }
      System.out.println("Matrix B");
        int[][] b= new int[10][10];
        for (int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                b[i][j]=rand.nextInt(10);
                
                System.out.print(b[i][j]+" ");  
            }
            System.out.println();
       
        }
        int[][]c=new int[10][10];
        System.out.println("perkalian matrix A x B");
        c[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0];
        c[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1];
        c[1][0]=a[1][0]*b[0][0]+a[1][1]*b[1][0];
        c[1][1]=a[1][0]*b[0][1]+a[1][1]*b[1][1];  
        
        for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                System.out.print(c[i][j]+" ");
      
        }
            
           System.out.println();
     }
        int [][]h= new int[10][10];
        System.out.println("tranpose matrix");
           //Rumus dari tranpose yaitu baris menjadi kolom dan kolom menjadi baris
        for (int i=0;i<=1;i++){ //i perulangan baris
            for(int j=0;j<=1;j++){  //j perulangan kolom
                System.out.print(c[j][i]+" ");  //dibalik baris kmudian kolom 
            } 
            System.out.println();
}
        int [][]n= new int[10][10];
        System.out.println("Adjoin dari perkalian matrix ");
       n[0][0]=c[1][1];
       n[0][1]=-c[0][1];
       n[1][0]=-c[1][0];
       n[1][1]=c[0][0];
        for (int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
   
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
}
       int [][]e= new int[10][10];
       
             e[0][0]=a[0][0]*a[1][1]-a[0][1]*a[1][0];
 
        System.out.println("hasil dari determinan matrix A: "+e[0][0]);
        
        System.out.println("invers");
        
       int [][]v= new int[10][10];
                 
              
          for (int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
             v[i][j]=1*n[i][j]/e[0][0]; //1/determinan*adjoin atau 1*adjoin/determinan
            System.out.print(v[i][j]+" ");
}
            System.out.println();
    }
}
}

