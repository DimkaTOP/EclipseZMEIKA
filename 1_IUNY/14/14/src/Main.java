import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 10, 3 };
        int secondLargest = findSecondLargest(arr);
        System.out.println("������ �� �������� ����� � �������: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        if (n < 2) {
            throw new IllegalArgumentException("������ ������ ��������� ��� ������� ��� ��������");
        }

        int secondLargest = arr[n - 2];
        return secondLargest;
    }
}