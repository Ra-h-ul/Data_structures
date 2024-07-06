// Topoogical sort using BFS(khan's algorithm)


import java.util.*;

public class Topo_sort_II {

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

    
    public static ArrayList<Integer> khan( ArrayList<Edge> graph[])
    {
        Queue<Integer> qu = new LinkedList<>();
        int[] indegree = new int[graph.length];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int curr=0 ; curr<graph.length ; curr++)
        {
            for(int i =0 ; i<graph[curr].size() ; i++)
            {
                Edge e = graph[curr].get(i);
                indegree[e.dest]+=1;
            }
        }

        for(int i=0 ;i<indegree.length ; i++)
        {
            if(indegree[i]==0)
            qu.add(i);
        }

        while(!qu.isEmpty())
        {
            int current = qu.poll();
            ans.add(current);
            for(int i =0 ; i<graph[current].size() ; i++)
            {
                Edge e = graph[current].get(i);
                if(indegree[e.dest]== 1) qu.add(e.dest);
                else indegree[e.dest] -=1;
            }
        }

        return ans;

    }
    

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        create_graph(graph);
    
        System.out.println(khan(graph));


        


        
    }
}