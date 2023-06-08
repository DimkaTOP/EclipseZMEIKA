
import java.util.*;

public class MillionSmallestNumbers {
	public List<Integer> findMillionSmallestNumbers(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int blockSize = 10000;
        int numBlocks = (int) Math.ceil((double) arr.length / blockSize);

        
        List<int[]> blocks = new ArrayList<>();
        for (int i = 0; i < numBlocks; i++) {
            int[] block = Arrays.copyOfRange(arr, i * blockSize, Math.min((i + 1) * blockSize, arr.length));
            Arrays.sort(block);
            blocks.add(block);
        }

    
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(block -> block[0]));
        for (int[] block : blocks) {
            if (block.length > 0) {
                pq.add(new int[]{block[0], 0, block});
            }
        }
        int count = 0;
        while (!pq.isEmpty() && count < 1000000) {
            int[] curr = pq.poll();
            result.add(curr[0]);
            count++;
            if (curr[1] + 1 < curr[2].length) {
                pq.add(new int[]{curr[2][curr[1] + 1], curr[1] + 1, curr[2]});
            }
        }
        return result;
    }
}
