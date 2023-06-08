import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 10, 3 };
        int secondLargest = findSecondLargest(arr);
        System.out.println("Второе по величине число в массиве: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        if (n < 2) {
            throw new IllegalArgumentException("Массив должен содержать как минимум два элемента");
        }

        int secondLargest = arr[n - 2];
        return secondLargest;
    }
}