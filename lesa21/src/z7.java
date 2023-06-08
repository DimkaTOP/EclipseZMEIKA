
public class z7 {

	public static void main(String[] args) {
		int arr[] = new int[12];
		 int indexMax = 0;
		 for (int i = 0; i < arr.length; i++) {
	            int a = (int) (Math.random() * 30) - 15;
	            arr[i] = a;
		 }
	        for (int i = 1; i < arr.length; i++) {
	        	 if (arr[i] > arr[indexMax]) {
	                 indexMax = i;
	        }
	}
	        System.out.println("Максимальный элемент в массиве под индексом " + indexMax);
    }
}


