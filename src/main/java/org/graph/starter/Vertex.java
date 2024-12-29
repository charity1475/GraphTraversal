package org.graph.starter;

import java.util.ArrayList;

public class Vertex {
  private String data;
  private ArrayList<Edge> edges;

  public Vertex(String data) {
    this.data = data;
    this.edges = new ArrayList<Edge>();
  }

  public void addEdge(Vertex endVertex, Integer weight) {
    Edge edge = new Edge(this, endVertex, weight);
    this.edges.add(edge);
  }
  public void removeEdge(Vertex endVertex){
    this.edges.removeIf(edge -> edge.getEndVertex().equals(endVertex));
  }

  public String getData() {
    return this.data;
  }

  public ArrayList<Edge> getEdges() {
    return this.edges;
  }

  public void printEdges(){
    for(Edge edge : this.edges){
      System.out.println(edge.getStartVertex().getData() + " -> " + edge.getEndVertex().getData() + " : " + edge.getWeight());
    }
  }
}
