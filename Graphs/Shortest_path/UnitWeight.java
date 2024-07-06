
import java.util.*;
public class UnitWeight {

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
        graph[0].add(new Edge(0, 5, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 2, 1));

        graph[4].add(new Edge(4, 1, 1));
        graph[4].add(new Edge(4, 3, 1));

        graph[5].add(new Edge(5, 0, 1));

    }

    public static void shortest_distance(ArrayList<Edge> graph[], int curr, int[] distance, boolean[] vis) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(curr);
        while (!qu.isEmpty()) {
            curr = qu.poll();
            if (!vis[curr]) {
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);

                    qu.add(e.dest);
                    if (distance[curr] + e.wt < distance[e.dest]) {
                        distance[e.dest] = distance[curr] + e.wt;
                    }

                }
            }

        }

    }

    public static void main(String[] args) {
        int vertex = 6;
        int src = 0;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        create_graph(graph);
        int[] distance = new int[vertex];
        for (int i = 0; i < distance.length; i++) {
            if (i != src) {
                distance[i] = Integer.MAX_VALUE;
            }
        }

        shortest_distance(graph, src, distance, new boolean[vertex]);

        for (int i = 0; i < distance.length; i++) {
            System.out.print(distance[i] + " ");
        }

    }
}
