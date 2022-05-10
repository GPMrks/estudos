package Queues;

public class Queue<T> {

    private Node<T> refNodeEnterQueue;

    public Queue() {
        this.refNodeEnterQueue = null;
    }

    public void enqueue(T object) {
        Node<T> newNode = new Node<>(object);
        newNode.setRefNode(refNodeEnterQueue);
        refNodeEnterQueue = newNode;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            Node firstNode = refNodeEnterQueue;
            Node nodeAssist = refNodeEnterQueue;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    nodeAssist = firstNode;
                    firstNode = firstNode.getRefNode();
                } else {
                    nodeAssist.setRefNode(null);
                    break;
                }
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    public T first() {
        if (!this.isEmpty()) {
            Node firstNode = refNodeEnterQueue;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    firstNode = firstNode.getRefNode();
                } else {
                    break;
                }
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNodeEnterQueue == null ? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        Node nodeAssist = refNodeEnterQueue;

        if (refNodeEnterQueue != null) {
            while (true) {
                stringReturn += "[Node{object=" + nodeAssist.getObject() + "}]--->";
                if (nodeAssist.getRefNode() != null) {
                    nodeAssist = nodeAssist.getRefNode();
                } else {
                    stringReturn += "null";
                    break;
                }
            }
        } else {
            stringReturn = "null";
        }

        return stringReturn;
    }
}
