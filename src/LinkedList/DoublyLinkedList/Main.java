package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        List list = new List();

        // add nodes to start
        list.addToStart("A");
        list.addToStart("B");
        list.addToStart("C");

        // add nodes to end
        list.addToEnd("D");
        list.addToEnd("E");
        list.addToEnd("F");

        // print list forward
        // list.printForward();

        // delete node
        String valueToDelete = "D";
        list.delete(valueToDelete);

        // print list backward
        list.printBackward();

        // search an element
        String valueToSearch = "D";
        System.out.println("is the " + valueToSearch + " value in the list? " + list.search(valueToSearch));

    }
}
