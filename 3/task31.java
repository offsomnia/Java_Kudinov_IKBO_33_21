import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

// 3.1

public class task31 {

    public static void main(String args[]) {

        int[] array = new int[(int)(Math.random() * 20)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Random array (Math.random): ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + ' ');
        }
        System.out.println();

        Arrays.sort(array);

        System.out.println("Sorted random array (Math.random): ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + ' ');
        }
        System.out.println();


        
        Random random = new Random();
        int[] array2 = new int[(int) (random.nextInt(20))];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (random.nextInt(100));
        }
        System.out.println();

        System.out.println("Random array (Random): ");
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i] + ' ');
        }
        System.out.println();

        Arrays.sort(array2);

        System.out.println("Sorted random array (Random): ");
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i] + ' ');
        }
        System.out.println();
    }
}
