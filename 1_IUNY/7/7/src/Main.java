import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

      
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " - ������� �����");
        } else {
            System.out.println(num + " - �� �������� ������� ������");
        }
    }
}