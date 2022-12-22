import java.util.Scanner;
import java.util.Arrays;

// 1.6

public class task16 {

	public static void main(String[] args)
	{

		int num = 10;
		double result = 0.0;

		System.out.println("The harmonic series is: ");

		while (num > 0) {
			result = (double)1 / num;
			num--;
			System.out.print(result + ", ");
		}
	}
}