import java.util.*;

public class Directed {
static class Graph{
	int V;
	LinkedList<Integer> adjArray[];
	
	public Graph(int V)
	{
		this.V=V;
		adjArray=new LinkedList[V];
		for(int i=0;i<V;i++)
		{
			adjArray[i]=new LinkedList<>();
		}
	}
	
}

static void addEdge(Graph gph,int src,int des)
{
	gph.adjArray[src].add(des);
}

static void printGraph(Graph gph)
{
	for(int i=0;i<gph.V;i++)
	{
		System.out.println("Adjacency List of Vertex:" + i);
		System.out.print("Head");
		for(Integer i2:gph.adjArray[i])
		{
			System.out.print("->" + i2);
		}
		System.out.println();
	}
}
public static void main(String [] args)
{
	 Graph graph = new Graph(4); 
	  
	 addEdge(graph, 0, 1); 
     addEdge(graph, 0, 4); 
     addEdge(graph, 1, 2); 
     addEdge(graph, 1, 3); 
     addEdge(graph, 1, 4); 
     addEdge(graph, 2, 3); 
     addEdge(graph, 3, 4); 
     
     printGraph(graph);

}
}
