
import java.util.*;


public class Articulation_point {

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

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));

        graph[5].add(new Edge(5,3));

        
    }

    public static void Articulation(ArrayList<Edge> graph[] , int curr , int parent , boolean[] vis , Integer[] low , Integer[] disc , int time , HashSet<Integer> ans)
    {
        vis[curr]=true;
        low[curr]=disc[curr]=++time;
        int child=0;
        for(int i =0 ; i<graph[curr].size() ; i++)
        {
            Edge e = graph[curr].get(i);

            if(!vis[e.dest] )
            {   
                child++;
                Articulation( graph, e.dest, curr, vis, low, disc, time , ans );
                low[curr]=Math.min(low[curr], low[e.dest]);
            }
            else if (vis[e.dest] && e.dest!=parent)
            {
                low[curr]=Math.min(disc[e.dest], low[curr]);
            }

            if(parent !=-1 && disc[curr]<=low[e.dest])
                {
                   ans.add(curr);
                }
        }

        if(parent==-1 && child>1)
        {
            ans.add(curr);
        }
        
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[]=new ArrayList[V];
       // Hashset<Integer> hs = new Hashset<>();
        HashSet<Integer> sx = new HashSet<>();
        create_graph(graph);
        Articulation(graph, 0, -1, new boolean[V], new Integer[V], new Integer[V], 0,sx);
        System.out.println(sx);

    }
}


