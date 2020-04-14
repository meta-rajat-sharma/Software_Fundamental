package com.metacube.question01_02;

public class AdjacencyList {
    private int vertex;
    private int weight;

    public AdjacencyList(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getVertex() {
        return vertex;
    }
}
