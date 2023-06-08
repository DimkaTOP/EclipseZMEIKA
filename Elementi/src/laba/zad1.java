package laba;

import java.util.Arrays;
import java.util.Random;

public class zad1 {

	public static void main(String[] args) {
		int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        double[] thirdArray = new double[10];
        
        Random rn = new Random();
 
        for(int i = 0; i < 10; i++) { 
            firstArray[i] = rn.nextInt(9) + 1;
            secondArray[i] = rn.nextInt(9) + 1;
            thirdArray[i] = (double) firstArray[i]/secondArray[i];
        }
        
        int numberOfWholeNumbers = 0;
        for(int i = 0; i < thirdArray.length; i++)
            if(thirdArray[i] % 1 == 0) numberOfWholeNumbers++;
        
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(thirdArray));
        System.out.println("Количество целых элементов в третьем массиве: " + numberOfWholeNumbers);
    }
}
