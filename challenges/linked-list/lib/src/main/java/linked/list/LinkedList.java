package linked.list;
public class LinkedList <T>{
    public Node<T>  head;
    public int size;
    public LinkedList() {
        this.head = null;
    }

    public void insert(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;

        }
        size++;

    }
    public void insertAfter(T data ,T newData){
        Node<T> newNode = new Node<>(newData);
        if(head == null) {
            head = newNode;
        }
        else {
            Node<T> trav = head;
            while (trav.data != data) {

                trav = trav.next;
            }
            newNode.next = trav.next;
            trav.next = newNode;
        }
        size++;

    }
    public void insertBefore(T data , T newData){
        Node<T> newNode = new Node<>(newData);
        if(head == null) {
            head = newNode;
        }else if(data == head.data){
            newNode.next = head;
            head = newNode;
        }
        else {
            Node<T> trav = head;
            while (trav.next.data != data) {
                trav = trav.next;
            }
            newNode.next = trav.next;
            trav.next = newNode;
        }
        size++;

    }
    public void append (T data) {
        Node<T> newNode = new Node<>(data);
        if(this.head == null) {
            head = newNode;
        }
        else {
            Node<T> trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = newNode;
        }
        size++;

    }
    public boolean includes (T key) {
        Node<T> trav = head;
        while (trav != null) {
            if(trav.data.equals(key)){
                return true;
            }
            trav = trav.next;
        }
        return false;
    }

    @Override
    public String toString() {
        String list = "{ ";
        Node<T> temp = head;
        while (temp != null) {
            list += temp.data + " -> ";
            temp = temp.next;
        }
        if (temp == null) {
            list += temp + " }";
        }
        return list;
    }
}

