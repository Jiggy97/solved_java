package Bronze;

import java.util.*;

public class bfs {

    public static void BFS(Graph graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.getNumVertices()];

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            List<Integer> adjacentVertices = graph.getAdjacentVertices(vertex);
            for (int adjacentVertex : adjacentVertices) {
                if (!visited[adjacentVertex]) {
                    queue.offer(adjacentVertex);
                    visited[adjacentVertex] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);  // 그래프의 정점 개수

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        int startVertex = 0;  // 탐색을 시작할 정점

        System.out.println("BFS 탐색 결과:");
        BFS(graph, startVertex);
    }
}

class Graph {
    private final int numVertices;
    private final List<List<Integer>> adjacencyList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyList = new ArrayList<>(numVertices);

        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public List<Integer> getAdjacentVertices(int vertex) {
        return adjacencyList.get(vertex);
    }

    public int getNumVertices() {
        return numVertices;
    }
}
