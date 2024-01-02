
package semester3;
import java.util.Scanner;
public class Sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int[] arr = new int[10];
        int indexMax = arr.length - 1;
        int i, j;
        int temp;

        // Input data
        System.out.println("Input nilai ke-");
        for (i = 0; i <= indexMax; i++) {
            System.out.print(i + ": ");
            arr[i] = input.nextInt();
        }

        // Proses pengurutan
        for (i = 1; i <= indexMax; i++) {
            for (j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil pengurutan:");
        for (i = 0; i <= indexMax; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}  

