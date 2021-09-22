// CS224 Fall 2021

import java.util.ArrayList;

public class Node {
    ArrayList<Node> adjlist;
    int name;
    boolean marked;

    public Node(int name) {
        this.name = name;
        this.adjlist = new ArrayList<Node>();
        this.marked = false;
    }

    public void add(Node other) {
        this.adjlist.add(other);
    }
}
