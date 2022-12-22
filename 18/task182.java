import java.util.Scanner;

public class task182 {

    static class Exception2 {
        public void exceptionDemo()
        {
            try {
                Scanner myScanner = new Scanner(System.in);
                System.out.print("Enter an integer ");
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Неверный формат ввода!");
            }
        }
    }
    
    public static void main(String[] args)
    {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }
}
