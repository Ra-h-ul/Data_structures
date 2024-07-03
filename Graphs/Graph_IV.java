// cycle detection in directed  graph


import java.util.*;

public class Graph_IV {

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
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        // graph[3].add(new Edge(3, 1));
    

    }

   


    public static boolean cycle_directed(ArrayList<Edge> graph[] , boolean[] vis , boolean[] rec , int current)
    {
        vis[current]=true;
        rec[current]=true;

        for(int i=0 ; i<graph[current].size(); i++)
        {
            Edge e = graph[current].get(i);
            if(rec[e.dest]==true) return true;
            else if(!vis[e.dest] && cycle_directed(graph, vis, rec, e.dest)) return true;
        }

        return false;
    }

    

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4];
        create_graph(graph);


        boolean[] rec = new boolean[graph.length];
        boolean[] vis = new boolean[graph.length];
        boolean flag = false;
        for(int i=0 ; i<graph.length ; i++)
        {
            if(!vis[i] && cycle_directed(graph, vis, rec, i))
            {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
        


        
    }
}