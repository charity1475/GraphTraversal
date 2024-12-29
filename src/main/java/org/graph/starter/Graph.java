package org.graph.starter;

import java.util.ArrayList;

public class Graph {
  /**
   * The list of vertices in the graph.
   */
  private ArrayList<Vertex> vertices;
  private boolean weighted;
  private boolean directed;

  public Graph(boolean weighted, boolean directed) {
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

  public void removeVertex(Vertex vertex){
    this.vertices.remove(vertex);
    for(Vertex v : this.vertices){
      v.removeEdge(vertex);
    }
  }

  public ArrayList<Vertex> getVertices() {
    return this.vertices;
  }

  public boolean isWeighted() {
    return this.weighted;
  }

  public boolean isDirected() {
    return this.directed;
  }

  public Vertex getVertexByValue(String value) {
    for (Vertex vertex : this.vertices) {
      if (vertex.getData().equals(value)) {
        return vertex;
      }
    }
    return null;
  }

  public void printGraph(){
    for(Vertex vertex : this.vertices){
      System.out.println("Vertex: " + vertex.getData());
      vertex.printEdges();
    }
  }
}
