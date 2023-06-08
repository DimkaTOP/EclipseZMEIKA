
public class z4 {

	public static void main(String[] args) {
		int arr1[] = new int[5];
        int arr2[] = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        double avg1;
        double avg2;
        for (int i = 0; i < arr1.length; i++) {
            int a = (int) (Math.random() * 5);
            arr1[i] = a;
            sum1 = sum1 + a;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        avg1 = (double) sum1 / (double) arr1.length;
        System.out.println("Среднее арифмитическое равно " + avg1);
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            int b = (int) (Math.random() * 5);
            arr2[i] = b;
            sum2 = sum2 + b;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        avg2 = (double) sum2 / (double) arr2.length;
        System.out.println("Среднее арифмитическое равно " + avg2);
        if (avg1 > avg2) {
            System.out.println("Cреднее арифметическое элементов первого массива больше");
        }
        if (avg1 < avg2) {
            System.out.println("Cреднее арифметическое элементов второго массива больше");
        } else if (avg1 == avg2) {
            System.out.println("Cреднее арифметическое элементов двух массивов равны");
        }
    }
}
