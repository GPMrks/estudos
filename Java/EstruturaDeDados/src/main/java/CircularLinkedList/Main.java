package CircularLinkedList;

public class Main {

    public static void main(String[] args) {

        CircularLinkedList<String> myCircularLinkedList = new CircularLinkedList<String>();

        myCircularLinkedList.add("c0");

        System.out.println(myCircularLinkedList);

        myCircularLinkedList.remove(0);

        System.out.println(myCircularLinkedList);

        myCircularLinkedList.add("c1");

        System.out.println(myCircularLinkedList);

        myCircularLinkedList.add("c2");
        myCircularLinkedList.add("c3");

        System.out.println(myCircularLinkedList);

        System.out.println(myCircularLinkedList.get(0));
        System.out.println(myCircularLinkedList.get(1));
        System.out.println(myCircularLinkedList.get(2));
        System.out.println(myCircularLinkedList.get(3));
        System.out.println(myCircularLinkedList.get(4));
        System.out.println(myCircularLinkedList.get(5));

        for (int i = 0; i < 10; i++){
            System.out.println(myCircularLinkedList.get(i));
        }


    }
}
