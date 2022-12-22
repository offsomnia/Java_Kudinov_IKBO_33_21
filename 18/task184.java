import java.util.Scanner;

public class task184 {

    static class Exception2 {
        public void exceptionDemo() {
            String intString = "";
            try {
                Scanner myScanner = new Scanner(System.in);
                System.out.print("Enter an integer ");
                intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода!");
            } finally {
                System.out.printf("Введённые данные: %s", intString);
            }
        }
    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }
}
