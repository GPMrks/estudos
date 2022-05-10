package BasicConcepts;

//Using Generics accepting any type of data
public class Node<T> {

    private T content;
    private Node<T> nextNode;

    public Node(T content) {
        this.content = content;
        this.nextNode = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                '}';
    }

}
