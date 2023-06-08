import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        // Считываем предпочтения мальчиков и девочек
        boolean[][] preferences = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String row = scanner.next();
            for (int j = 0; j < M; j++) {
                preferences[i][j] = row.charAt(j) == 'Y';
            }
        }

        // Создаем граф и добавляем исток и сток
        int source = 0;
        int sink = N + M + 1;
        int[][] graph = new int[N + M + 2][N + M + 2];

        // Добавляем ребра от истока к мальчикам
        for (int i = 1; i <= N; i++) {
            graph[source][i] = 1;
        }

        // Добавляем ребра от мальчиков к девочкам
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (preferences[i - 1][j - 1]) {
                    graph[i][N + j] = 1;
                }
            }
        }

        // Добавляем ребра от девочек к стоку
        for (int j = 1; j <= M; j++) {
            graph[N + j][sink] = 1;
        }

        // Ищем максимальный поток в графе
        int maxFlow = maxFlow(graph, source, sink);

        // Выводим результат
        System.out.println(maxFlow);
    }

    private static int maxFlow(int[][] graph, int source, int sink) {
        int[] parent = new int[graph.length];
        int maxFlow = 0;

        while (bfs(graph, source, sink, parent)) {
            int pathFlow = Integer.MAX_VALUE;
            int v = sink;
            while (v != source) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, graph[u][v]);
                v = u;
            }

            v = sink;
            while (v != source) {
                int u = parent[v];
                graph[u][v] -= pathFlow;
                graph[v][u] += pathFlow;
                v = u;
            }

        //    3 3 2
           // YYY
          //  NYN
           // YYY
            maxFlow += pathFlow;
        }

        return maxFlow;
    }

    private static boolean bfs(int[][] graph, int source, int sink, int[] parent) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v = 0; v < graph.length; v++) {
                if (!visited[v] && graph[u][v] > 0) {
                    visited[v] = true;
                    parent[v] = u;
                    queue.add(v);
                }
            }
        }

        return visited[sink];
    }
}