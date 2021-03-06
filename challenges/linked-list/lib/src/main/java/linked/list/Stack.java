package linked.list;

public class Stack<T> {
    StackNode top;
    public void push(int value) {
        StackNode newNode = new StackNode(value);
        if (top == null)
            top = newNode;
        else {
            StackNode temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println(value + " pushed to stack");
    }
    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (top == null)
            System.out.println("Stack is Empty");
        else {
            popped = top.data;
            top = top.next;
        }
        return popped;
    }
    public int getMax(){
        int max = 0;
        StackNode temp = this.top;
        max = temp.data;
        while (temp != null){
            if (temp.data > max){
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }
    @Override
    public String toString() {
        StackNode temp = this.top;
        StringBuilder output = new StringBuilder();
        if (temp == null) {
            return "Please fill the Linked List";
        }
        while (temp != null) {
            output.append("{ ").append(temp.data).append(" } -> ");
            temp = temp.next;
        }
        output.append("NULL");
        return output.toString();
    }
}
