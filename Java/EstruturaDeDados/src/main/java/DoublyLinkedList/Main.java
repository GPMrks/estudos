package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList<String> myDoublyLinkedList = new DoublyLinkedList<String>();

        myDoublyLinkedList.add("c1");
        myDoublyLinkedList.add("c2");
        myDoublyLinkedList.add("c3");
        myDoublyLinkedList.add("c4");
        myDoublyLinkedList.add("c5");
        myDoublyLinkedList.add("c6");
        myDoublyLinkedList.add("c7");

        System.out.println(myDoublyLinkedList);

        myDoublyLinkedList.remove(3);
        myDoublyLinkedList.add(3, "99");

        System.out.println(myDoublyLinkedList);

        System.out.println(myDoublyLinkedList.get(3));

        System.out.println(myDoublyLinkedList.size());

        System.out.println(myDoublyLinkedList);

        System.out.println(myDoublyLinkedList.isEmpty());
    }
}
