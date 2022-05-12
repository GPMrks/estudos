package DoublyLinkedList;

import Queues.Node;

public class DoublyLinkedList<T> {

    private DoublyNode<T> firstNode;
    private DoublyNode<T> lastNode;

    private int listSize;

    public DoublyLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.listSize = 0;
    }

    public T get(int index) {
        return this.getNode(index).getContent();
    }

    public void add(T content) {
        DoublyNode<T> newNode = new DoublyNode<>(content);
        newNode.setNextNode(null);
        newNode.setPrevNode(lastNode);
        if (firstNode == null) {
            firstNode = newNode;
        }
        if (lastNode != null) {
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
        listSize++;
    }

    public void add(int index, T content) {
        DoublyNode<T> nodeAssist = getNode(index);
        DoublyNode<T> newNode = new DoublyNode<>(content);

        newNode.setNextNode(nodeAssist);

        if (newNode.getNextNode() != null) {
            newNode.setPrevNode(nodeAssist.getPrevNode());
            newNode.getNextNode().setPrevNode(newNode);
        } else {
            newNode.setPrevNode(lastNode);
            lastNode = newNode;
        }

        if (index == 0) {
            firstNode = newNode;
        } else {
            newNode.getPrevNode().setNextNode(newNode);
        }

        listSize++;
    }

    public void remove(int index) {

        if (index >= size()) {
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("Content not available at index " + index + " in this list. This list goes until index " + lastIndex + ".");
        }

        if (index == 0) {
            firstNode = firstNode.getNextNode();
            if (firstNode != null) {
                firstNode.setPrevNode(null);
            }
        } else {
            DoublyNode<T> nodeAssist = getNode(index);
            nodeAssist.getPrevNode().setNextNode(nodeAssist.getNextNode());
            if(nodeAssist != lastNode){
                nodeAssist.getNextNode().setPrevNode(nodeAssist.getPrevNode());
            } else {
                lastNode = nodeAssist;
            }
        }

        this.listSize--;
    }

    public int size() {
        return this.listSize;
    }

    public boolean isEmpty() {
        return firstNode == null ? true : false;
    }

    private DoublyNode<T> getNode(int index) {

        if (index >= size()) {
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("Content not available at index " + index + " in this list. This list goes until index " + lastIndex + ".");
        }

        DoublyNode<T> nodeAssist = firstNode;

        for (int i = 0; (i < index) && (nodeAssist != null); i++) {
            nodeAssist = nodeAssist.getNextNode();
        }
        return nodeAssist;
    }

    @Override
    public String toString() {
        String strReturn = "";

        DoublyNode<T> nodeAssist = firstNode;

        for (int i = 0; i < size(); i++){
            strReturn += "[Node{content=" + nodeAssist.getContent() + "}]--->";
            nodeAssist = nodeAssist.getNextNode();
        }

        strReturn += "null";

        return strReturn;
    }

}
