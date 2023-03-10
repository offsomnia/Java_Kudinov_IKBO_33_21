import java.util.Scanner;

// 3.3

public class task33 {
    public static void main(String[] args) {
        int[] Mas = new int[4];
        // С помощью первого цикла заполним значения елементов массива
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) (Math.random() * 90 + 10);
            System.out.print(Mas[i] + " ");
        }
        // С помощью второго цикла переберем по очереди значения елементов массива
        for (int i = 0; i < Mas.length; i++) {
            // Если следующий элемент меньше или равен предыдущему, цикл прерывается и
            // выводится сообщение о том, что прогрессия не возрастающая
            if (i > 0) {
                if (Mas[i - 1] >= Mas[i]) {
                    System.out.println("Прогрессия не возрастающая");
                    break;

                }
            }
            // Если перебрали все значения элементов массива и цикл не прервался - выводим
            // сообщение о том, что последовательность возрастающая
            if (i == Mas.length - 1)
                System.out.println("Последовательность строго возрастающая");
        }
    }
}
