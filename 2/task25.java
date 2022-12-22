import java.util.Scanner;

// 2.5


public class task25 {
    public static void main(String[] args) {

        Dog dog_1 = new Dog(5, 10.2, "Max");
        Dog dog_2 = new Dog(10, 5.7);
        Dog dog_3 = new Dog();
        dog_1.speedCompare(dog_2);
        dog_3.speedCompare(dog_1);
        System.out.println("Count dog: " + Dog.dogCount);

        System.out.println();
        System.out.println();
        
    }
}