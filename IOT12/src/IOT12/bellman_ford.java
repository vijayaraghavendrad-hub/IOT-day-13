package IOT12;
import java.util.*;
public class bellman_ford {
	    static class Edge {
	        int source, destination, weight;

	        Edge(int source, int destination, int weight) {
	            this.source = source;
	            this.destination = destination;
	            this.weight = weight;
	        }
	    }

	    public static void main(String[] args) {

	        int vertices = 5;

	        Edge[] edges = {
	            new Edge(0, 1, 6),
	            new Edge(0, 2, 7),
	            new Edge(1, 2, 8),
	            new Edge(1, 3, 5),
	            new Edge(1, 4, -4),
	            new Edge(2, 3, -3),
	            new Edge(2, 4, 9),
	            new Edge(3, 1, -2),
	            new Edge(4, 3, 7)
	        };

	        int[] distance = new int[vertices];

	        Arrays.fill(distance, 9999);

	        int source = 0;
	        distance[source] = 0;

	        // Relax edges V-1 times
	        for (int i = 1; i < vertices; i++) {

	            for (Edge edge : edges) {

	                if (distance[edge.source] != 9999 &&
	                    distance[edge.source] + edge.weight < distance[edge.destination]) {

	                    distance[edge.destination] =
	                        distance[edge.source] + edge.weight;
	                }
	            }
	        }

	        for (Edge edge : edges) {

	            if (distance[edge.source] != 9999 &&
	                distance[edge.source] + edge.weight < distance[edge.destination]) {

	                System.out.println("Negative cycle exists");
	                return;
	            }
	        }

	        System.out.println("Shortest distances from source " + source + ":");

	        for (int i = 0; i < vertices; i++) {
	            System.out.println(source + " -> " + i + " = " + distance[i]);
	        }
	    }

}
