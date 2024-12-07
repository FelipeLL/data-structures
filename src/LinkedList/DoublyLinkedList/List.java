package LinkedList.DoublyLinkedList;

public class List {
    Node head;
    Node tail;

    public List(){
        this.head = null;
        this.tail = null;
    }

    public void addToEnd(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void addToStart(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void printForward(){

        if(head == null){
            System.out.println("List is empty");
        }

        Node current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void printBackward(){

        if(tail == null){
            System.out.println("List is empty");
        }

        Node current = tail;

        while(current != null){
            System.out.println(current.data);
            current = current.previous;
        }
    }

    public boolean search(String value){
        Node current = head;

        while(current != null ){
            if(current.data.equals(value)){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public void delete(String value){
        Node current = head;

        while(current != null && !current.data.equals(value)){
            current = current.next;
        }

        if(current == null){
            System.out.println("Element '" + value + "' not found");
        } else if(current.previous == null && current.next == null){
            head = null;
            tail = null;
        } else if(current.previous == null){
            head = current.next;
            head.previous = null;
        } else if(current.next == null){
            tail = current.previous;
            tail.next = null;
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }

    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
        } else if(head == tail){
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }
    }

    public void deleteLast(){
        if(tail == null){
            System.out.println("List is empty");
        } else if(head == tail){
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
    }
}
