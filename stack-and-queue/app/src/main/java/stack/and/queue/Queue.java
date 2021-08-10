package stack.and.queue;

public class Queue <T>{
    int size =0;
    public  Node <T> front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(T value) {
        Node <T> newNode = new Node<T>(value);

        if (this.rear == null) {
            this.front = this.rear = newNode;
            size++;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
        size++;
    }


    public T dequeue() {
        if (this.front == null) {
            System.out.println(" Queue is empty");
            size--;
            return null;
        } else {
            Node  temp = this.front;
            this.front = this.front.next;
            temp.next = null;
            size--;
            return (T) temp.data;
        }
    }
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return 0;
        } else
            return (int) front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        String queueValue = "Queue { ";
        Node trav = front;
        while (trav != null){
            queueValue += trav.data + " -> ";
            trav = trav.next;
        }
        queueValue += "X }";
        return queueValue;
    }
}
