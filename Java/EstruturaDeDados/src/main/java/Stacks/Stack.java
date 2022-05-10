package Stacks;

public class Stack {

    private Node refNodStartStack;

    public Stack() {
        this.refNodStartStack = null;
    }

    public void push(Node newNode) {
        Node refAssist = refNodStartStack;
        refNodStartStack = newNode;
        refNodStartStack.setRefNod(refAssist);
    }

    public Node pop() {
        if (!this.isEmpty()) {
            Node popNode = refNodStartStack;
            refNodStartStack = refNodStartStack.getRefNod();
        }
        return null;
    }

    public Node top() {
        return refNodStartStack;
    }

    public boolean isEmpty() {
        return refNodStartStack == null ? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "--------------\n";
        stringReturn += "    Pilha   \n";
        stringReturn += "--------------\n";

        Node nodeAssist = refNodStartStack;

        while (true) {
            if (nodeAssist != null) {
                stringReturn += "[Node{data=" + nodeAssist.getData() + "}]\n";
                nodeAssist = nodeAssist.getRefNod();
            } else {
                break;
            }
        }
        stringReturn += "==============\n";
        return stringReturn;
    }
}
