package stack.and.queue;

public class Queue <T>{
    int size =0;
    public Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (this.rear == null) {
            this.front = this.rear = newNode;
            size++;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
        size++;
    }


    public int dequeue() {
        if (this.front == null) {
            System.out.println(" Queue is empty");
            size--;
            return 0;
        } else {
            Node temp = this.front;
            this.front = this.front.next;
            temp.next = null;
            size--;
            return temp.data;
        }
    }
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return 0;
        } else
            return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }
}
