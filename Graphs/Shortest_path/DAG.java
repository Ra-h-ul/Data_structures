import java.util.*;

public class DAG {

    public static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void create_graph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 3, 2));

        graph[2].add(new Edge(2, 3, 0));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 5, 3));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 5, 1));

    }

    public static void shortest_distance(ArrayList<Edge> graph[], int curr, int[] distance) {

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (e.wt + distance[curr] < distance[e.dest]) {
                distance[e.dest] = e.wt + distance[curr];
                shortest_distance(graph, e.dest, distance);
            }

        }
    }

    public static void Toposort(ArrayList<Edge> graph[], int curr, Stack<Integer> st, boolean[] vis) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest])
                Toposort(graph, e.dest, st, vis);
        }
        st.push(curr);
    }

    public static void main(String[] args) {
        int vertex = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[vertex];

        create_graph(graph);

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i])
                Toposort(graph, i, st, vis);
        }

        int src = 1;
        while (st.peek() != src) {
            st.pop();
        }

        int[] distance = new int[vertex];
        for (int i = 0; i < distance.length; i++) {
            if (i == src)
                distance[src] = 0;
            else
                distance[i] = Integer.MAX_VALUE;
        }
        shortest_distance(graph, st.peek(), distance);

        for (int i = 0; i < distance.length; i++) {
            if (distance[i] == Integer.MAX_VALUE)
                System.out.print("INFINITY ");
            else
                System.out.print(distance[i] + " ");
        }

    }
}
