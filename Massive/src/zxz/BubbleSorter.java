package zxz;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 3, 4};
        int n = arr.length;
        boolean sorted = false;
        
        for (int i = 0; i < n - 1 && !sorted; i++) {
        	sorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
                
                System.out.println("Проход: " + (i+1) + ", i: " + i + ", j: " + j + ", Массив: " + Arrays.toString(arr));
                
            }
        }
        System.out.println("Отсортированый массив: " + Arrays.toString(arr));
    }
}