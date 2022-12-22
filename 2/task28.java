import java.util.Scanner;
import java.util.Arrays;

// 2.8

public class task28{
    public static void main(String[] args){

        String[] colors = {"aaaaaaa", "bbbbbbb", "ccccccc", "ddddddd"};

        for (int i = 0; i < colors.length / 2; i++)
        {
            String result = colors[i];
            colors[i] = colors[colors.length - i - 1];
            colors[colors.length - i - 1] = result;
        }
        for (int i = 0; i < colors.length; i++)
        {
            System.out.println(colors[i]);
        }

        
    }
}