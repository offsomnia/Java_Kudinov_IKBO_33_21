import java.util.Scanner;

// 1.3

public class task13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        int sum = 0;
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            int temp = input.nextInt();
            array[i] = temp;
            sum += temp;
        }

        // System.out.println("\nSum: " + Arrays.stream(array).sum());
        System.out.print("\nSum: " + sum + "; Average: " + sum/size);
        System.out.println();
    }
}
