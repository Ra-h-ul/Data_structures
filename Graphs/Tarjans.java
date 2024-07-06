
import java.util.ArrayList;

public class Tarjans {

    public static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
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
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));

        graph[3].add(new Edge(3, 6));
        graph[6].add(new Edge(6, 3));
    }

    public static void Tarjans_algo(ArrayList<Edge> graph[] , int curr , int parent , boolean[] vis , Integer[] low , Integer[] disc , int time)
    {
        vis[curr]=true;
        low[curr]=disc[curr]=++time;

        for(int i =0 ; i<graph[curr].size() ; i++)
        {
            Edge e = graph[curr].get(i);

            if(!vis[e.dest] )
            {
                Tarjans_algo( graph, e.dest, curr, vis, low, disc, time);
                low[curr]=Math.min(low[curr], low[e.dest]);
            }
            else if (vis[e.dest] && e.dest!=parent)
            {
                low[curr]=Math.min(disc[e.dest], low[curr]);
            }

            if(disc[curr]<low[e.dest])
            {
                System.out.println(curr + "-------" + e.dest);
            }
        }
        
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        create_graph(graph);
        Tarjans_algo(graph, 0, -1, new boolean[V], new Integer[V], new Integer[V], 0);

    }
}
