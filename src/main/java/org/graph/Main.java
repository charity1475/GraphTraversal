package org.graph;

import org.graph.starter.Graph;

public class Main {
  public static void main(String[] args) {
    Graph stationsNetwork = new Graph(true, true);

    // Add vertices
    stationsNetwork.addVertex("Station A");
    stationsNetwork.addVertex("Station B");
    stationsNetwork.addVertex("Station C");
    stationsNetwork.addVertex("Station D");
    stationsNetwork.addVertex("Station E");

    // Add edges
    stationsNetwork.addEdge(stationsNetwork.getVertices().get(0), stationsNetwork.getVertices().get(1), 5);
    stationsNetwork.addEdge(stationsNetwork.getVertices().get(0), stationsNetwork.getVertices().get(2), 10);
    stationsNetwork.addEdge(stationsNetwork.getVertices().get(1), stationsNetwork.getVertices().get(3), 15);
    stationsNetwork.addEdge(stationsNetwork.getVertices().get(2), stationsNetwork.getVertices().get(4), 20);
    stationsNetwork.addEdge(stationsNetwork.getVertices().get(3), stationsNetwork.getVertices().get(4), 25);

    System.out.println("============ Graph ============");
    stationsNetwork.printGraph();
  }
}
