package lab1804;
		import java.util.List;
		import java.util.ArrayList;

		public class edd {

		public int findDuplicateNumber(List<Integer> numbers) {

		int highestNumber = numbers.size() - 1;
		int total = getSum(numbers);
		int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
		return duplicate;
		}

		public int getSum(List<Integer> numbers) {

		int sum = 0;
		for (int num : numbers) {
		sum = sum + num;
		}
		return sum;
		}

		public static void main(String a[]) {
		List <Integer> numbers = new ArrayList <Integer>();
		List <Integer> numbers1 = new ArrayList <Integer>();
		List <Integer> numbers2 = new ArrayList <Integer>();
		for (int i = 1; i < 100; i++) {
		numbers.add(i);
		numbers1.add(i);
		numbers2.add(i);
		}
		numbers.add(25);
		numbers1.add(50);
		numbers2.add(33);
		edd dn = new edd();
		System.out.println("Элемент, который повторяется: " + dn.findDuplicateNumber(numbers) +  " встречается 4 раза");
		System.out.println("Элемент, который повторяется: " + dn.findDuplicateNumber(numbers1) + " встречается 2 раза");
		System.out.println("Элемент, который повторяется: " + dn.findDuplicateNumber(numbers2) + " встречается 3 раза с остатком в 1");
		}
		

	}


