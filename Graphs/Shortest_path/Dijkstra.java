import java.util.*;
public class Dijkstra {
    
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src , int dest , int wt) {
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }

     
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int weight;

        public Pair(int node , int weight){
            this.node=node;
            this.weight=weight;
        }

        @Override
        public int compareTo(Pair p2)
        {
            return this.weight-p2.weight;
        }
    }

    public static void Dijkstra_algo( List<Edge>[] graph , int src)
    {
        int[] distance = new int[graph.length];
        boolean[] vis = new boolean[graph.length];
        for(int i=0 ; i<distance.length ;i++)
        {
            if(i!=src) distance[i]=Integer.MAX_VALUE;
        }
        PriorityQueue<Pair> qu = new PriorityQueue<>();
        Pair p = new Pair(src, 0);
        qu.add(p);

        while(!qu.isEmpty())
        {
            Pair curr = qu.poll();
            if(!vis[curr.node])
            {
                vis[curr.node]=true;
                for(int i=0 ; i<graph[curr.node].size() ; i++)
                {
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.dest] && distance[curr.node] + e.wt < distance[e.dest])
                    {
                        distance[e.dest]=distance[curr.node] + e.wt;
                        qu.add(new Pair(e.dest, distance[e.dest]));
                    }
                }
            }

        }


        for(int i=0 ;i<distance.length ;i++)
        {
            System.out.print(distance[i] + " ");
        }

    }
  


    public static void main(String[] args) {
         int[][] matrix = {
            { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
            { 0, 0, 2, 0, 0, 0, 6, 7, 0 }
        };

        List<Edge>[] graph = new List[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    graph[i].add(new Edge(i, j, matrix[i][j]));
                }
            }
        }

        Dijkstra_algo(graph,0);
    }
}
