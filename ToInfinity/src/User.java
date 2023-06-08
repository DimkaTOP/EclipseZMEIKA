import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class User {
	
		private static void findDuplicate(List<Integer> elements) {
			
			int distinctSum = elements.stream().distinct().mapToInt(e -> e).sum();
			
			int totalSum = elements.stream().mapToInt(e -> e).sum();
			
			        System.out.println("Ёлемент, который повтор€етс€ : " + (totalSum - distinctSum));
			        
	}
		public static void main(String[] args) {
			
			 List <Integer> elements = IntStream.range(1, 101).boxed().collect(Collectors.toList());
			 
			        elements.set(53, 23);
			        
			        findDuplicate(elements);
		}
}
