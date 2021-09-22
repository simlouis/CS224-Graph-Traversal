// CS224 Fall 2021

import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {
    ArrayList<Node> nodes;

    public Graph() {
        nodes = new ArrayList<Node>();
    }

    public void addNode(Node n) {
        for (int i=0; i<nodes.size(); ++i) {
            if (nodes.get(i).name == n.name) {
                System.out.println("ERROR: graph already has a node " + n.name);
                assert false;
            }
        }
        nodes.add(n);
    }

    public void addEdge(Node n1, Node n2) {
        // add n2 to adjacency list of n1
        int idx1 = nodes.indexOf(n1);
        if (idx1 >= 0) {
            for (int i=0; i<nodes.get(idx1).adjlist.size(); ++i) {
                if (nodes.get(idx1).adjlist.get(i).name == n2.name) {
                    System.out.println("ERROR: there is already an edge " + n1.name + " -> " + n2.name);
                    assert false;
                }
            }
            nodes.get(idx1).add(n2);
        } else {
            System.out.println("node " + n1.name + " not found in graph");
            assert false;
        }

        // add n1 to adjacency list of n2
        int idx2 = nodes.indexOf(n2);
        if (idx2 >= 0) {
            for (int i=0; i<nodes.get(idx2).adjlist.size(); ++i) {
                if (nodes.get(idx2).adjlist.get(i).name == n1.name) {
                    System.out.println("ERROR: there is already an edge " + n2.name + " -> " + n1.name);
                    assert false;
                }
            }
            nodes.get(idx2).add(n1);
        } else {
            System.out.println("node " + n1.name + " not found in graph");
            assert false;
        }
    }

    public void print() {
        for (int i=0; i<nodes.size(); ++i) {
            Node n = nodes.get(i);
            System.out.print("Node " + n.name + ":");
            for (int j=0; j<n.adjlist.size(); ++j)
                System.out.print(" " + n.adjlist.get(j).name);
            System.out.println();
        }
    }

    public void BFS(Node s) {
        // fill this in
    }

    // this assumes the nodes have already been marked, from a BFS traversal
    public void checkForOddCycle() {
        // fill this in
    }

    public void DFS(Node s) {
        // fill this in
    }
}
