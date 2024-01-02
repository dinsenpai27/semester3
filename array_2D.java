package semester3;
import java.util.Random;

public class array_2D {
    public static void main (String args [])
    {
        int[][] a=new int[10][10];
        Random inp = new Random();
        
        System.out.println("Matrix A :");
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=3;j++)
            {
                a[i-1][j-1]=inp.nextInt(9);
            }
        }
        
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        int[][] b=new int[10][10];
        
        System.out.println("Matrix B :");
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=3;j++)
            {
                b[i-1][j-1]=inp.nextInt(9);
            }
        }
        
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Hasil Penjumlahan Matrix A + Matrix B :");
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=3;j++)
            {
                System.out.print((a[i-1][j-1]+b[i-1][j-1])+" "); 
            }
            System.out.println();
        }
        
        System.out.println("Hasil Pengurangan Matrix A - Matrix B :");
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=3;j++)
            {
                System.out.print((a[i-1][j-1]-b[i-1][j-1])+" "); 
            }
            System.out.println();
        }
        
        System.out.println("Hasil Pengurangan Matrix B - Matrix A :");
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=3;j++)
            {
                System.out.print((b[i-1][j-1]-a[i-1][j-1])+" "); 
            }
            System.out.println();
        }
    }
}
