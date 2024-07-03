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

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4];
        create_graph(graph);
        get_neighbours(0 , graph);
        get_neighbours(1 , graph);
        get_neighbours(2 , graph);
        get_neighbours(3 , graph);

        get_all_neighbours(graph);
    }
}