package linked.list;

public class LinkedList {
    Node head;


    public LinkedList(Node head) {
        this.head = head;
    }

    public void insert(Node newNode){
        newNode.next= head;
        head =newNode;
    }


    public void show() {
        Node newOne = head;
        while(newOne != null) {
            System.out.println(newOne.value);
            newOne = newOne.next;
        }
    }

    public boolean search(Node head, int element) {
        Node newOne = head;

        while (newOne != null)
        {
            if (newOne.getValue() == element){
                return true;
            }
            newOne = newOne.next ;
        }
        return false;
    }


    public String toString(){
        String result = "";
        Node newOne = head;
        while(newOne != null){
            result +="{";
            result += newOne.value;
            result +="}";
            result += " -> ";
            newOne = newOne.next;
        }
        result += "Null";
        return result;
    }
}

