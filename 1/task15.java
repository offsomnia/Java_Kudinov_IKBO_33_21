import java.util.Scanner;
import java.util.Arrays;

// 1.5

public class task15{
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        // System.out.println("Args: " + Arrays.toString(args));
    }
}