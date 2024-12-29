package org.graph;

import java.util.ArrayList;
import org.graph.starter.Vertex;

public class Main {
  /**
   * The list of vertices in the graph.
   */
  private ArrayList<Vertex> vertices;
  private boolean weighted;
  private boolean directed;

  public Main(boolean weighted, boolean directed) {
    this.vertices = new ArrayList<Vertex>();
    this.weighted = weighted;
    this.directed = directed;
  }

  public Vertex addVertex(String data) {
    Vertex vertex = new Vertex(data);
    this.vertices.add(vertex);
    return vertex;
  }

  public void addEdge(Vertex startVertex, Vertex endVertex, Integer weight) {
    if (!this.weighted) {
      weight = null;
    }
    if (this.directed) {
      startVertex.addEdge(endVertex, weight);
    } else {
      startVertex.addEdge(endVertex, weight);
      endVertex.addEdge(startVertex, weight);
    }
  }

  public void removeEdge(Vertex startVertex, Vertex endVertex){
    startVertex.removeEdge(endVertex);
    if(!this.directed){
      endVertex.removeEdge(startVertex);
    }
  }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
