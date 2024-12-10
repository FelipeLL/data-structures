package LinkedList.CircularLinkedList;

public class List {
    private Node head;

    public List(){
        this.head = null;
    }

    public void addToEnd(String data) {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;

            while(current.next != head){
                current = current.next;
            }

            current.next = newNode;
            newNode.next = head;
        }
    }

    public void addToStart(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;

            while(current.next != head){
                current = current.next;
            }

            current.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);

    }

    public boolean search(String value) {
        if (head == null) {
            System.out.println("List is empty");
            return false;
        }

        Node current = head;

        do {
            if (current.data.equals(value)) {
                System.out.println("Element '" + value + "' found");
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    public void delete(String value){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        Node previous = null;

        if(head.data.equals(value)){
            if(head.next == head){
                head = null;
            } else {
                // Find the last node to maintain circularity
                while(current.next != head){
                    current = current.next;
                }

                current.next = head.next;
                head = head.next;
            }

            return;
        }

        do {
            previous = current;
            current = current.next;

            if(current.data.equals(value)){
                previous.next = current.next;
                return;
            }
        } while (current != head);

        System.out.println("Element '" + value + "' not found");
    }
}
