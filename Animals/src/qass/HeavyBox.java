package qass;

import java.util.Scanner;
import java.util.ArrayList;

public class HeavyBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¬ведите набор чисел в виде одной строки, разделенных зап€тыми:");
        String input = scanner.nextLine();

        String[] numbers = input.split(", ");

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for (String number : numbers) {
            int num = Integer.parseInt(number.trim());
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

        System.out.println("”никальные числа:");
        for (int number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}