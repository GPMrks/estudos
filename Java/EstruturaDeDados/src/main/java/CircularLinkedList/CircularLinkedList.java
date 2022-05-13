package CircularLinkedList;

public class CircularLinkedList<T> {

    private Node<T> headNode;
    private Node<T> tailNode;
    private int listSize;

    public CircularLinkedList() {
        this.tailNode = null;
        this.headNode = null;
        this.listSize = 0;
    }

    public void add(T content){
        Node<T> newNode = new Node<>(content);
        if (this.listSize == 0){
            this.headNode = newNode;
            this.tailNode = this.headNode;
            this.headNode.setNextNode(this.tailNode);
        } else {
            newNode.setNextNode(this.tailNode);
            this.headNode.setNextNode(newNode);
            this.tailNode = newNode;
        }
        this.listSize++;
    }

    public T get(int index){
        return this.getNode(index).getContent();
    }

    public void remove(int index){
        if (index >= this.size()){
            throw new IndexOutOfBoundsException("The index is greater than list size.");
        }

        Node<T> nodeAssist = this.tailNode;

        if (index == 0){
            this.tailNode = this.tailNode.getNextNode();
            this.headNode.setNextNode(this.tailNode);
        } else if (index == 1) {
            this.tailNode.setNextNode(this.tailNode.getNextNode().getNextNode());
        } else {
            for (int i = 0; i < index-1; i++){
                nodeAssist = nodeAssist.getNextNode();
            }
            nodeAssist.setNextNode(nodeAssist.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    private Node<T> getNode(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("The list is empty.");
        }
        if(index == 0){
            return this.tailNode;
        }

        Node<T> nodeAssist = this.tailNode;

        for (int i = 0; (i < index) && (nodeAssist != null); i++){
            nodeAssist = nodeAssist.getNextNode();
        }

        return nodeAssist;
    }

    public boolean isEmpty(){
        return listSize == 0 ? true : false;
    }

    public int size(){
        return this.listSize;
    }

    @Override
    public String toString() {
        String strReturn = "";

        Node<T> nodeAssist = this.tailNode;

        for (int i = 0; i < this.size(); i++){
            strReturn += "[Node{content=" + nodeAssist.getContent() + "}]--->";
            nodeAssist = nodeAssist.getNextNode();
        }

        strReturn += this.size() != 0 ? "(Return to Head)" : "[]";

        return strReturn;
    }

}
