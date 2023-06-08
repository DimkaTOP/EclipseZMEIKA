package zxz;
import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
        int[] arr = {0, 2, 5, 3, 4};

        System.out.println("i \t j \t Array");

       
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
          
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                System.out.printf("%d\t%d\t%s\n", i, j, Arrays.toString(arr));
                }
            }
            System.out.println("Отсортированый массив: " + Arrays.toString(arr));
        }
    }
}

