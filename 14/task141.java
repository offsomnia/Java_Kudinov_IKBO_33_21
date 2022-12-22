import java.util.Arrays;
import java.util.Scanner;

public class task141 {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter pattern:");
        String p = sc.nextLine();
        System.out.println(Arrays.toString(str.split(p)));
    }
}