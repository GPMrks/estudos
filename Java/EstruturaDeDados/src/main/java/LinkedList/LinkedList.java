package LinkedList;

public class LinkedList<T> {

    Node<T> refStart;

    public LinkedList() {
        this.refStart = null;
    }

    public int size() {
        int listSize = 0;

        Node<T> refAssist = refStart;

        while (true) {
            if (refStart != null) {
                listSize++;
                if (refAssist.getNextNode() != null) {
                    refAssist = refAssist.getNextNode();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return listSize;
    }

    public void add(T content) {
        Node<T> newNode = new Node<>(content);

        if (this.isEmpty()) {
            refStart = newNode;
            return;
        }

        Node<T> nodeAssist = refStart;

        for (int i = 0; i < this.size() - 1; i++) {
            nodeAssist = nodeAssist.getNextNode();
        }

        nodeAssist.setNextNode(newNode);

    }

    public T get(int index){
        indexValidation(index);
        return getNode(index).getContent();
    }

    public boolean isEmpty() {
        return refStart == null ? true : false;
    }

    public T remove(int index){

        Node<T> nodeTarget = this.getNode(index);

        if(index == 0){
            refStart = nodeTarget.getNextNode();
            return nodeTarget.getContent();
        }

        Node<T> previousNode = getNode(index - 1);
        previousNode.setNextNode(nodeTarget.getNextNode());

        return nodeTarget.getContent();

    }

    @Override
    public String toString(){
        String strReturn = "";
        Node<T> nodeAssist = refStart;

        for (int i = 0; i < this.size(); i++){
            strReturn += "[Node{" + nodeAssist.getContent() + "}]---->";
            nodeAssist = nodeAssist.getNextNode();
        }

        strReturn += "null";

        return strReturn;
    }

    private Node<T> getNode(int index) {

        indexValidation(index);

        Node<T> nodeAssist = refStart;
        Node<T> nodeReturn = null;

        for (int i = 0; i <= index; i++) {
            nodeReturn = nodeAssist;
            nodeAssist = nodeAssist.getNextNode();
        }

        return nodeReturn;

    }

    private void indexValidation(int index) {
        if (index >= size()) {
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("Content not available at index " + index + " in this list. This list goes until index " + lastIndex + ".");
        }
    }

}
