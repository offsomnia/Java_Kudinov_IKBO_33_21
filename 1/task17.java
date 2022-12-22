import java.util.Scanner;

// 1.7

public class task17{

    public static int factorial(int f){
        int factorial_result = 1; 
        for (int i = 1; i <= f; i++) {
            factorial_result *= i;
        }
        return factorial_result;
    }  

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        System.out.println("Answer: " + factorial(n));

    }
}