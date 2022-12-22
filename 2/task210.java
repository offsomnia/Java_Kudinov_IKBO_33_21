import java.util.Scanner;

// 2.10

public class task210 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words: ");
        String input = sc.nextLine();
        int count = 0;

        if(input.length() != 0){
            count++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        }

        System.out.println("Number of words: " + count);
    }
}