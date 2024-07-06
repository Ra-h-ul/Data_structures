// Topoogical sort using DFS


import java.util.*;

public class Topo_sort_I {

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

        graph[2].add(new Edge(2, 3));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

    }

    public static void DFS(ArrayList<Edge> graph[] , Stack<Integer> st , int curr , boolean[] vis )
    {
        vis[curr]=true;

        for(int i =0 ; i< graph[curr].size() ; i++)
        {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])
            {
                DFS(graph, st, e.dest, vis);
            }
        }
        st.push(curr);
    }

    public static void Topo_sort(ArrayList<Edge> graph[])
    {
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> st = new Stack<>();
        for(int i =0 ; i<graph.length ; i++)
        {
            if(!vis[i])
            {
                DFS(graph , st , i , vis);
            }
        }

        while(!st.isEmpty())
        {
            System.out.print(st.pop() +" ");
        }
        System.out.println();
    }
  
    

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        create_graph(graph);
        Topo_sort(graph);


        


        
    }
}