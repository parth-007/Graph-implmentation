import java.util.*;
public class DFS {
static class Graph{
	int V;
	LinkedList<Integer> adjArray[];
	
	public Graph(int V)
	{
		this.V=V;
		
		adjArray = new LinkedList[V];
		for(int i=0;i<V;i++)
		{
			adjArray[i]=new LinkedList<>();
		}
	}
	
}
static void addEdge(Graph g,int source,int destination)
{
	g.adjArray[source].add(destination);
}

static void DFSonGraph(Graph g,int start)
{
	boolean[] visited = new boolean[g.V];
	DFSUtil(g, start,visited);
}
static void DFSUtil(Graph g,int v,boolean visited[])
{
	visited[v]=true;
	System.out.print(v + " ");
	Iterator<Integer> i = g.adjArray[v].listIterator();
	while(i.hasNext())
	{
		int n = i.next();
		if(!visited[n])
			DFSUtil(g,n,visited);
	}
}

public static void main(String[] args)
{
	Graph g=new Graph(4);
	addEdge(g,0,1);
	addEdge(g,0,2);
	addEdge(g,1,2);
	addEdge(g,2,0);
	addEdge(g,2,3);
	addEdge(g,3,3);
	
	System.out.println("Following is Depth First Traversal "+ 
            "(starting from vertex 0)"); 

	DFSonGraph(g,0);
	System.out.println();
	System.out.println("Following is Depth First Traversal "+ 
            "(starting from vertex 1)"); 

	DFSonGraph(g,1);
	System.out.println();
	System.out.println("Following is Depth First Traversal "+ 
            "(starting from vertex 2)"); 

	DFSonGraph(g,2);
	System.out.println();
	System.out.println("Following is Depth First Traversal "+ 
            "(starting from vertex 3)"); 

	DFSonGraph(g,3);
	
	
}
}

