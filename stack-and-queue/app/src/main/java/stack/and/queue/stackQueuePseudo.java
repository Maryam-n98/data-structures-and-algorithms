package stack.and.queue;

public class stackQueuePseudo <T>{
   Stack <Integer> stack1;
   Stack <Integer> stack2;

    public stackQueuePseudo() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue(T data){
        this.stack1.push((Integer) data);
    }
    public T dequeue(){
        if (this.stack1.top == null)
            return null;
        while (this.stack1.top != null){
            this.stack2.push(this.stack1.peek());
            this.stack1.pop();
        }
        Integer data = (Integer)this.stack2.pop();
        while (this.stack2.top != null){
            this.stack1.push(this.stack2.peek());
            this.stack2.pop() ;
        }
        return (T) data;
    }

    @Override
    public String toString() {
        if (stack1.top == null)
            return stack2.toString();

        else if (stack2.top == null)
            return stack1.toString();
        else
            return "Empty";
    }
}
