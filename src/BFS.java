import java.util.Iterator;
import java.util.LinkedList;



public class BFS {
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

static void BFSonGraph(Graph gph,int s)
{
	//create array for checking that whether vertex got visited or not
	
	boolean [] visited = new boolean[gph.V];
	LinkedList<Integer> q = new LinkedList<Integer>();
	
	visited[s]=true;
	q.add(s);
	
	while(!q.isEmpty())
	{
		s=q.poll();
		System.out.println(s+ " " );
		Iterator<Integer> i = gph.adjArray[s].listIterator();
		while(i.hasNext()) {
			int i1 = i.next();
			if(!visited[i1])
			{
				visited[i1]=true;
				q.add(i1);
			}
			else
			{
				
			}
		}
	}
}
public static void main(String [] args)
{
	 Graph graph = new Graph(4); 
	  
	 addEdge(graph, 0, 1); 
     addEdge(graph, 0, 2); 
     addEdge(graph, 1, 2); 
     addEdge(graph, 2, 0); 
      
     addEdge(graph, 2, 3); 
     addEdge(graph, 3, 3); 
     
     printGraph(graph);
     System.out.println("BFS From 2:");
     BFSonGraph(graph,2);
     System.out.println();
     System.out.println("BFS From 1:");
     BFSonGraph(graph,1);
     System.out.println();
     System.out.println("BFS From 3:");
     BFSonGraph(graph,3);
     System.out.println();
     System.out.println("BFS From 0:");
     BFSonGraph(graph,0);
     
    // BFSonGraph(graph,0);
//     BFSonGraph(graph,1);
//     BFSonGraph(graph,2);
//     BFSonGraph(graph,3);

}
}
