
import java.lang.*;
import java.util.ArrayList;
import java.util.Stack;

public class Kosaraju {

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
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 7));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 4));
        graph[6].add(new Edge(6, 7));

    }

    public static void DFS(ArrayList<Edge> graph[], boolean[] vis, int curr, Stack<Integer> st) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest])
                DFS(graph, vis, e.dest, st);
        }

        st.push(curr);
    }

    public static ArrayList<Integer> DFS2(ArrayList<Edge> graph[], boolean[] vis, int curr , ArrayList<Integer> ds ) {
        vis[curr] = true;
        ds.add(curr);
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest])
                DFS2(graph, vis, e.dest , ds);
        }
        return ds;
    }

    public static void Transpose(ArrayList<Edge> graph[], ArrayList<Edge> graphT[]) {

        for (int i = 0; i < graphT.length; i++) {
            graphT[i] = new ArrayList<Edge>();
        }

        for (int curr = 0; curr < graph.length; curr++) {
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                graphT[e.dest].add(new Edge(e.dest, e.src));
            }
        }
    }

    public static void main(String[] args) {
        int V = 8;
        Stack<Integer> st = new Stack<>();
        ArrayList<Edge> graph[] = new ArrayList[V];
        ArrayList<Edge> graphT[] = new ArrayList[V];
        create_graph(graph);
        
        // creating a copy of old graph with  reversed edges
        Transpose(graph, graphT);

        // arraging elements according to their finishing time(doing topo sort) 
        boolean[] vis = new boolean[V];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i])
                DFS(graph, vis, i, st);
        }

        

        // getting all the connect components and their count 
        boolean[] vis2 = new boolean[V];
        int cnt = 0;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < graphT.length; i++) {
            int current = st.pop();
            if (!vis2[current]) {
                cnt++;
                ans.add(DFS2(graphT, vis2, current , new ArrayList<>()));
            }
        }

        System.out.println(cnt);
        System.out.println(ans);

    }
}
