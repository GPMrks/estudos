package Stacks;

public class Node {

    private int data;
    private Node refNod;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.refNod = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRefNod() {
        return refNod;
    }

    public void setRefNod(Node refNod) {
        this.refNod = refNod;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
