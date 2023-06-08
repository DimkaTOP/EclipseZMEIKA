import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку или число: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;

        // Убираем пробелы из строки и приводим к нижнему регистру
        input = input.replaceAll("\\s", "").toLowerCase();

        // Цикл проверки на палиндром
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Вывод результата в зависимости от того, является ли введенное значение палиндромом или нет
        if (isPalindrome) {
            System.out.println(input + " - палиндром");
        } else {
            System.out.println(input + " - не палиндром");
        }
    }
}