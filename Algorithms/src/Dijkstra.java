
public class Dijkstra {
	int INF=Integer.MAX_VALUE;
	final int V=9;//dimensions of a graph
	public void shortestPath(int graph[][],int start)
	{
		
		int dist[]=new int[V];
		 boolean pathSet[] = new boolean[V];
		 
	        for (int i = 0; i < V; i++)
	        {
	            dist[i] = INF;
	            pathSet[i] = false;
	        }
	        dist[start] = 0;
	        for (int count = 0; count < V-1; count++)
	        {
	           
	            int u = minDistanceVertex(dist, pathSet);
	 
	          
	            pathSet[u] = true;
	 
	        
	            for (int i = 0; i < V; i++)
if (dist[u]+graph[u][i] < dist[i] && !pathSet[i] && graph[u][i]!=0 && dist[i] != INF )
	                    dist[i] = dist[u] + graph[u][i];
	        }
	 
	        printSolution(dist, V);
		
	}
	
	public int  minDistanceVertex(int dist[],boolean pathSet[])
	{
		int min=INF,min_index=-1;
		for(int i=0;i<V;i++)
		{
			if(pathSet[i]==false && dist[i]<=min)
			{
				min=dist[i];
				min_index=i;
			}
			
			
		}
		return min_index;
	}
	void printSolution(int dist[], int n)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" 		 "+dist[i]);
    }
	public static void main(String[] args) {
//		//int[][] graph=new int[][] { {0, 4, 0, 0, 0, 0, 0, 8},
//									{4, 0, 8, 0, 0, 0, 0, 11},
//									{0, 8, 0, 7, 0, 4, 0, 0},
//									{0, 0, 7, 0, 9, 14, 0, 0},
//									{0, 0, 0, 9, 0, 10, 0, 0},
//									{0, 0, 4, 14, 10, 0, 2, 0},
//									{0, 0, 0, 0, 0, 2, 0, 1},
//									{8, 11, 0, 0, 0, 0, 1, 0}};
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
									{4, 0, 8, 0, 0, 0, 0, 11, 0},
										{0, 8, 0, 7, 0, 4, 0, 0, 2},
										{0, 0, 7, 0, 9, 14, 0, 0, 0},
										{0, 0, 0, 9, 0, 10, 0, 0, 0},
										{0, 0, 4, 14, 10, 0, 2, 0, 0},
										{0, 0, 0, 0, 0, 2, 0, 1, 6},
										{8, 11, 0, 0, 0, 0, 1, 0, 7},
										{0, 0, 2, 0, 0, 0, 6, 7, 0}
																};
									
			Dijkstra obj=new Dijkstra();
			obj.shortestPath(graph,0);

	}

}
