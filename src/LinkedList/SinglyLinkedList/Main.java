package LinkedList.SinglyLinkedList;


public class Main {
    public static void main(String[] args) {
        List list = new List();

        // add nodes
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // show list
        list.display();

        // search an element
        String valueToSearch = "C";
        System.out.println("is the " + valueToSearch + " value in the list? " + list.search(valueToSearch));

        // delete node
        String valueToDelete = "E";
        list.delete(valueToDelete);

        // show list
        list.display();
    }
}
