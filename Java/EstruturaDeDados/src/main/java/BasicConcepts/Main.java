package BasicConcepts;

public class Main {

    public static void main(String[] args) {

        Node<String> node1 = new Node<>("Content Node1");

        Node<String> node2 = new Node<>("Content Node2");

        node1.setNextNode(node2);

        Node<String> node3 = new Node<>("Content Node3");

        node2.setNextNode(node3);

        Node<String> node4 = new Node<>("Content Node4");

        node3.setNextNode(node4);

        Node<Integer> node5 = new Node<>(100);

        Node<Boolean> node6 = new Node<>(false);

        node4.setNextNode(node5);

        node5.setNextNode(node6);

        //node1-->node2-->node3-->node4-->null

//        System.out.println(node1);
//        System.out.println(node1.getNextNode());
//        System.out.println(node2);

        System.out.println(node1);
        System.out.println(node1.getNextNode());
        System.out.println(node1.getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode().getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode().getNextNode().getNextNode().getNextNode());


    }
}
