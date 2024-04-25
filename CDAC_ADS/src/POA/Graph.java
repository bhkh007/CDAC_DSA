package POA;

import java.util.LinkedList;
import java.util.Queue;

import java.util.Stack;

public class Graph {

   private LinkedList<Integer>[] adj;
   private int V; // number of vertices
   private int E; // number of edges

   public Graph(int nodes) {
      this.V = nodes;
      this.E = 0;
      this.adj = new LinkedList[nodes];
      for (int v = 0; v < V; v++) {
         adj[v] = new LinkedList<>();
      }
   }

   public void addEdge(int u, int v) {
      adj[u].add(v);
      adj[v].add(u);
      E++;
   }

  
   public void bfs(int s) {
      boolean[] visited = new boolean[V];

      Queue<Integer> q = new LinkedList<>();
      visited[s] = true;
      q.offer(s);

      while (!q.isEmpty()) {
         int u = q.poll();
         System.out.print(u + " ");

         for (int v : adj[u]) {
            if (!visited[v]) {
               visited[v] = true;
               q.offer(v);
            }
         }
      }
   }


   public static void main(String[] args) {
      Graph g = new Graph(5);
      g.addEdge(0, 1);
      g.addEdge(1, 2);
      g.addEdge(2, 3);
      g.addEdge(3, 0);
      g.addEdge(2, 4);
      // 4
      
      g.bfs(0);
   }
}