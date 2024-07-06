// cycle detection in directed  graph

import java.util.*;

public class Graph_III {

    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void create_graph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        // graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));
        // graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));
        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));

    }

    // dfs approach
    public static boolean cycle_undirected(ArrayList<Edge> graph[], int current, int parent, boolean[] vis) {
        vis[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (vis[e.dest] && e.dest != parent) {
                return true;
            } else if (!vis[e.dest] && cycle_undirected(graph, e.dest, current, vis)) {
                return true;
            }

        }
        return false;
    }

    public static class Pair {
        int current;
        int parent;

        public Pair(int current, int parent) {
            this.current = current;
            this.parent = parent;
        }

    }

    public static boolean cycle_undirected_I(ArrayList<Edge> graph[], Pair p, boolean[] vis) {
        Queue<Pair> qu = new LinkedList<>();
        qu.add(p);

        while (!qu.isEmpty()) {
            Pair element = qu.poll();
            if (!vis[element.current]) {
                vis[element.current] = true;
                for (int i = 0; i < graph[element.current].size(); i++) {
                    Edge e = graph[element.current].get(i);

                    if (vis[e.dest] && e.dest != element.parent)
                        return true;
                    else if (!vis[e.dest]) {
                        Pair pi = new Pair(e.dest, e.src);
                        qu.add(pi);
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        create_graph(graph);

        System.out.println( cycle_undirected(graph, 0, -1, new boolean[6]));

        boolean[] vis = new boolean[graph.length];
        System.out.println(cycle_undirected_I(graph, new Pair(0, -1), vis));

    }
}