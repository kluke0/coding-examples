package com.kluke.examples.tree;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private final String layer;
    private final List<Node> children = new ArrayList<>();
    private final List<String> leaves = new ArrayList<>();


    public Node(String layer) {
        this.layer = layer;
    }

    public void addChild(Node child) {
        children.add(child);
    }

    public String getLayer() {
        return layer;
    }

    public List<Node> getChildren() {
        return children;
    }

    public List<String> getLeaves() {
        return leaves;
    }
}
