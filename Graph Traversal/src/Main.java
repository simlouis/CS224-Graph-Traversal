// CS224 Fall 2021

public class Main {
    public static void main(String args[]) {
        testThree();
    }

    public static void testOne() {
        // this is a connected component from the graph in Fig. 3.2
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        Graph G = new Graph();
        G.addNode(n1);
        G.addNode(n2);
        G.addNode(n3);
        G.addNode(n4);
        G.addNode(n5);
        G.addNode(n6);
        G.addNode(n7);
        G.addNode(n8);

        G.addEdge(n1, n2);
        G.addEdge(n1, n3);
        G.addEdge(n2, n3);
        G.addEdge(n2, n4);
        G.addEdge(n2, n5);
        G.addEdge(n3, n5);
        G.addEdge(n3, n7);
        G.addEdge(n3, n8);
        G.addEdge(n4, n5);
        G.addEdge(n5, n6);
        G.addEdge(n7, n8);
        //G.print();

        G.DFS(n1);
        G.BFS(n1);
    }

    public static void testTwo() {
        // here's another graph: a loop with an odd cycle
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        Graph G = new Graph();
        G.addNode(n1);
        G.addNode(n2);
        G.addNode(n3);
        G.addNode(n4);
        G.addNode(n5);
        G.addNode(n6);
        G.addNode(n7);
        G.addNode(n8);
        G.addNode(n9);

        G.addEdge(n1, n2);
        G.addEdge(n2, n3);
        G.addEdge(n3, n4);
        G.addEdge(n4, n5);
        G.addEdge(n5, n6);
        G.addEdge(n6, n7);
        G.addEdge(n7, n8);
        G.addEdge(n8, n9);
        G.addEdge(n9, n1);
        //G.print();

        G.DFS(n1);
        G.BFS(n1);
    }

    public static void testThree() {
        // from my notebook
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Graph G = new Graph();
        G.addNode(n1);
        G.addNode(n2);
        G.addNode(n3);
        G.addNode(n4);
        G.addNode(n5);
        G.addNode(n6);
        G.addNode(n7);
        G.addNode(n8);
        G.addNode(n9);
        G.addNode(n10);

        G.addEdge(n1, n2);
        G.addEdge(n1, n3);
        G.addEdge(n2, n3);
        G.addEdge(n2, n4);
        G.addEdge(n2, n5);
        G.addEdge(n2, n9);
        G.addEdge(n3, n4);
        G.addEdge(n3, n6);
        G.addEdge(n4, n5);
        G.addEdge(n5, n6);
        G.addEdge(n5, n8);
        G.addEdge(n5, n9);
        G.addEdge(n6, n7);
        G.addEdge(n6, n10);
        G.addEdge(n7, n8);
        G.addEdge(n8, n9);
        G.addEdge(n8, n10);

        G.BFS(n1);
    }
}
