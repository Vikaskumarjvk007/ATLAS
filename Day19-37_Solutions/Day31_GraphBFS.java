import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Day31_GraphBFS {

    private Map<Integer, List<Integer>> adjacencyList;

    public Day31_GraphBFS() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.putIfAbsent(destination, new ArrayList<>());

        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public List<Integer> bfs(int startVertex) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startVertex);
        visited.add(startVertex);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            result.add(current);

            List<Integer> neighbors = adjacencyList.get(current);
            if (neighbors != null) {
                for (int neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.offer(neighbor);
                    }
                }
            }
        }

        return result;
    }

    public boolean hasPath(int start, int end) {
        if (start == end)
            return true;

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            List<Integer> neighbors = adjacencyList.get(current);
            if (neighbors != null) {
                for (int neighbor : neighbors) {
                    if (neighbor == end)
                        return true;

                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.offer(neighbor);
                    }
                }
            }
        }

        return false;
    }

    public void displayGraph() {
        System.out.println("Graph adjacency list:");
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Day31_GraphBFS graph = new Day31_GraphBFS();

        System.out.print("Enter number of vertices: ");
        int vertices = scanner.nextInt();

        for (int i = 0; i < vertices; i++) {
            graph.addVertex(i);
        }

        System.out.print("Enter number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter edges (source destination):");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        graph.displayGraph();

        System.out.print("Enter starting vertex for BFS: ");
        int startVertex = scanner.nextInt();

        List<Integer> bfsResult = graph.bfs(startVertex);
        System.out.println("BFS traversal from vertex " + startVertex + ": " + bfsResult);

        System.out.print("Check path between two vertices (start end): ");
        int pathStart = scanner.nextInt();
        int pathEnd = scanner.nextInt();

        boolean pathExists = graph.hasPath(pathStart, pathEnd);
        System.out.println("Path exists between " + pathStart + " and " + pathEnd + ": " + pathExists);

        scanner.close();
    }
}