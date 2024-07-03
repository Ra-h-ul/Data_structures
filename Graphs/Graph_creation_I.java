// create a graph using Ajancancy  list

/**
 * Graph_creation_I
 */
import java.util.*;

public class Graph_creation_I {

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

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 1));

    }

    public static void get_neighbours(int i , ArrayList<Edge> graph[])
    {
        for(int j=0 ; j<graph[i].size() ; j++)
        {
            System.out.print(graph[i].get(j).dest + " ");
        }
        System.out.println();
    }

    public static void get_all_neighbours(ArrayList<Edge> graph[]) {
        for(int i=0 ; i<graph.length ; i++)
        {
            int src = i ;

            System.out.print("src : " +  src + " Dest : ");
            for(int j=0 ; j<graph[src].size() ; j++)
            {
                System.out.print(graph[src].get(j).dest + " ");
            }
            System.out.println();
        }
    }

    public static void BFS(ArrayList<Edge> graph[] , int current )
    {
        boolean[] vis = new boolean[graph.length];
        Queue<Integer> qu = new LinkedList<>();
        qu.add(current);

        while(!qu.isEmpty())
        {
            current=qu.poll();
            if(vis[current]==false)
            {
                System.out.print(current + " ");
                vis[current]=true;

                for(int i=0 ;i<graph[current].size() ; i++)
                {
                    Edge e = graph[current].get(i);
                    qu.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void DFS(ArrayList<Edge> graph[] , int current , boolean[] vis )
    {
        
       System.out.print(current+ " ");
       vis[current]=true;

       for(int i =0 ; i<graph[current].size() ; i++)
       {
            Edge e = graph[current].get(i);
            if(vis[e.dest]==false)
            {
                DFS(graph , e.dest , vis);
            }
       }

       
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4];
        create_graph(graph);
        boolean[] vis = new boolean[4];
        DFS(graph, 0, vis);
        System.out.println();
        BFS(graph, 0);
        
    }
}