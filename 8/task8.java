import java.util.Scanner;

public class task8 {

    public static String recursion1(int n) {
        int sum = 0;
        int j = 0;
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            // Шаг рекурсии / рекурсивное условие
            System.out.print(recursion1(--n) + " " + j);
        }
        return "";
    }

    public static int recursion17() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, recursion17());
        }
    }

    public static void recursion16(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n > max) {
                recursion16(n, 1);
            } // Шаг рекурсии / рекурсивное условие
            else if (n == max) {
                recursion16(max, ++count);
            } // Шаг рекурсии / рекурсивное условие
            else {
                recursion16(max, count);
            }
        } else {
            System.out.println(count);
        }
    }

    public static void main(String[] args) {

        // 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();
        recursion1(n);
        System.out.println();

        // 16

        System.out.println();
        recursion16(0, 0);
        System.out.println();


        // 17
        System.out.println(recursion17());
        System.out.println();

    }
}
