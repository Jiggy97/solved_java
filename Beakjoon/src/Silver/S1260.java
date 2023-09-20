package Silver;

import java.util.*;

public class S1260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        int[][] graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        boolean[] visited = new boolean[n + 1];
        dfs(graph, visited, v);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(graph, visited, v);
    }

    private static void dfs(int[][] graph, boolean[] visited, int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i < graph.length; i++) {
            if (graph[v][i] == 1 && !visited[i]) {
                dfs(graph, visited, i);
            }
        }
    }

    private static void bfs(int[][] graph, boolean[] visited, int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int i = 1; i < graph.length; i++) {
                if (graph[current][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
