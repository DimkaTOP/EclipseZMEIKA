import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ����� ��� ��������: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " �������� ������ ����������");
        } else {
            System.out.println(number + " �� �������� ������ ����������");
        }
    }

    public static boolean isArmstrong(int number) {
        int sum = 0;
        int original = number;
        int digits = 0;

        while (original > 0) {
            original /= 10;
            digits++;
        }

        original = number;

        while (original > 0) {
            int digit = original % 10;
            sum += Math.pow(digit, digits);
            original /= 10;
        }

        return (sum == number);
    }
}