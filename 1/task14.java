import java.util.Scanner;
import java.util.Arrays;

// 1.4

public class task14{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        
        int maxim = -1000000;
        int minim = 1000000;
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            int temp = input.nextInt();
            array[i] = temp;
            if (temp > maxim){
                maxim = temp;
            }
            if (temp < minim){
                minim = temp;
            }
        }
        int j = 0;
        int sum = 0;
        do{
            sum += array[j];
            j+=1;
            
        }
        while(size!=j);
        System.out.println("\nSum: " + sum + "; Maxim: " + maxim + "; Minim: " + minim);
        
    }
}