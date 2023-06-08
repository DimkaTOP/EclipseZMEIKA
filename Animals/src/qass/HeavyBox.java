package qass;

import java.util.Scanner;
import java.util.ArrayList;

public class HeavyBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������� ����� ����� � ���� ����� ������, ����������� ��������:");
        String input = scanner.nextLine();

        String[] numbers = input.split(", ");

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for (String number : numbers) {
            int num = Integer.parseInt(number.trim());
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

        System.out.println("���������� �����:");
        for (int number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}