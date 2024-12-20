package LinkedList.SinglyLinkedList;

public class List {
    private Node head;

    public List(){
        this.head = null;
    }

    // Método para agregar un nodo al final de la lista
    public void add(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else {
            Node current = head;

            while(current.next != null){
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void display() {
        if(head == null){
            System.out.println("La lista está vacía");
        }

        Node current = head;

        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean search(String value){

        Node current = head;

        while(current != null){
            if(current.data.equals(value)){
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public void delete(String value) {
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }

        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null && !current.next.data.equals(value)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("El valor no se encuentra en la lista");
        } else {
            current.next = current.next.next;
        }
    }

}
