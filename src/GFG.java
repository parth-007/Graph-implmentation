import java.util.*;
public class GFG {
	//A user define class to represent a graph. 
    // A graph is an array of adjacency lists. 
    // Size of array will be V (number of vertices  
    // in graph) 

	static class Graph{
		int V;
		LinkedList<Integer> adjListArray[];
		
		//Constructor
		
		Graph(int V)
		{
			this.V=V;
			//Define the size of array as number of vertices
			adjListArray = new LinkedList[V];
			//create a list for all nodes such that adjacent nodes can be stored.
			for(int i=0;i<V;i++)
			{
				adjListArray[i]=new LinkedList<>();
			}
		}	
	}
	//Utility function to add Edge
	static void addEdge(Graph graph,int dec,int src)
	{
		graph.adjListArray[src].add(dec);
//		Since graph is undirected, add an edge from dest 
//        // to src also
		graph.adjListArray[dec].add(src);
	}
	
	//A utility function to print
	static void printGraph(Graph graph)
	{
		for(int i=0;i<graph.V;i++)
		{
			System.out.println("Adjacency List of Vertex:" + i);
			System.out.print("head"); 
            for(Integer pCrawl: graph.adjListArray[i]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            
      
            System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int v=5;
		Graph graph = new Graph(v);
		addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
       
        // print the adjacency list representation of  
        // the above graph 
        printGraph(graph); 
	}
}
