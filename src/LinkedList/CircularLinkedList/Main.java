package LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        List list = new List();

        // add nodes
        list.addToEnd("C");
        list.addToEnd("D");
        list.addToStart("B");
        list.addToStart("A");

        // display list
        list.display();

        // delete node
        list.delete("A");
        list.delete("C");
        list.display();

        // trying to delete a non-existent node
        list.delete("E");

        // search an element
        String valueToSearch = "F";
        System.out.println("is the " + valueToSearch + " value in the list? " + list.search(valueToSearch));
    }
}
