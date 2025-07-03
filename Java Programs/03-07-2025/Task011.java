// Task 11: Display a graph's edges
class Graph {
    class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    int vertex;
    int edge;
    Edge[] edges;

    Graph(int vertex, int edge) {
        this.vertex = vertex;
        this.edge = edge;
        edges = new Edge[edge];
    }

    void displayEdges() {
        System.out.println("Graph edges:");
        for (int i = 0; i < edge; i++) {
            System.out.println(edges[i].src + " - " + edges[i].dest);
        }
    }

    public static void main(String[] args) {
        int vertex = 5;
        int edge = 8;
        Graph g = new Graph(vertex, edge);
        g.edges[0] = g.new Edge(1, 2);
        g.edges[1] = g.new Edge(1, 3);
        g.edges[2] = g.new Edge(1, 4);
        g.edges[3] = g.new Edge(2, 4);
        g.edges[4] = g.new Edge(2, 5);
        g.edges[5] = g.new Edge(3, 4);
        g.edges[6] = g.new Edge(3, 5);
        g.edges[7] = g.new Edge(4, 5);
        g.displayEdges();
    }
}
