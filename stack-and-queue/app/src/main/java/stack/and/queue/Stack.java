package stack.and.queue;

public class Stack<T> {
    int size =0;
    Node top;
    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null)
            top = newNode;
        else {
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
        size++;

    }
    public int pop() {
        int popElement = 0;
        if (top == null)
            System.out.println("Stack is Empty");
        else {
            popElement = top.data;
            top = top.next;
        }
        size--;

        return popElement;
    }

    public int peek() {
        if (top == null) {
            System.out.print(" empty stack ");
            return 0;
        } else
            return top.data;
    }


    public boolean isEmpty() {
        return top == null;
    }


    public int getSize() {
        return size;
    }
}
