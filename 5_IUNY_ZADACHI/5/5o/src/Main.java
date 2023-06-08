import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("INPUT.TXT"));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] field = new int[n][m];
        boolean[][] protectedCells = new boolean[n][m];

        for (int i = 0; i < k; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            protectedCells[x][y] = true;
        }

        sc.close();

        int minViruses = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (field[i][j] == 0 && !protectedCells[i][j]) {
                    minViruses = Math.min(minViruses, bfs(field, protectedCells, i, j));
                }
            }
        }

        PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
        pw.print(minViruses);
        pw.close();
    }

    private static int bfs(int[][] field, boolean[][] protectedCells, int startX, int startY) {
        int n = field.length;
        int m = field[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        field[startX][startY] = 1;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];

            if (x - 1 >= 0 && field[x - 1][y] == 0 && !protectedCells[x - 1][y]) {
                field[x - 1][y] = field[x][y] + 1;
                queue.offer(new int[]{x - 1, y});
            }
            if (x + 1 < n && field[x + 1][y] == 0 && !protectedCells[x + 1][y]) {
                field[x + 1][y] = field[x][y] + 1;
                queue.offer(new int[]{x + 1, y});
            }
            if (y - 1 >= 0 && field[x][y - 1] == 0 && !protectedCells[x][y - 1]) {
                field[x][y - 1] = field[x][y] + 1;
                queue.offer(new int[]{x, y - 1});
            }
            if (y + 1 < m && field[x][y + 1] == 0 && !protectedCells[x][y + 1]) {
                field[x][y + 1] = field[x][y] + 1;
                queue.offer(new int[]{x, y + 1});
            }
        }

        int maxTime = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (field[i][j] == 0 && !protectedCells[i][j]) {
                    return Integer.MAX_VALUE;
                }
                if (field[i][j] > maxTime) {
                    maxTime = field[i][j];
                }
            }
        }
        return maxTime - 1;
    }
}