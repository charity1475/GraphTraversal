package org.graph.starter;

public class Edge {
  private Vertex startVertex;
  private Vertex endVertex;
  private Integer weight;

  public Edge(Vertex startVertex, Vertex endVertex, Integer weight) {
    this.startVertex = startVertex;
    this.endVertex = endVertex;
    this.weight = weight;
  }

  public Vertex getStartVertex() {
    return this.startVertex;
  }

  public Vertex getEndVertex() {
    return this.endVertex;
  }

  public Integer getWeight() {
    return this.weight;
  }
}
