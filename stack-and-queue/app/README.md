##  Stacks and Queues
# Stack is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle.

# Queue is a container of objects (a linear collection) that are inserted and removed according to the first-in first-out (FIFO) principle.
## Challenge
Used Linked List as the underlying data storage mechanism.
In Stack: an order (First in last out), make methods, push to add new Node, pop to remove, peek to get the first "top" Node, is empty to return true or false.
In Queue:  make methods, enqueue to add new Node, dequeue to remove, peek to get the first "front" Node, is empty to return true or false.
## Approach & Efficiency
Stack Space and time O(1), We always have a pointer to the top element, we add or delete from top.
Queue Space and time O(1), We usually have a pointer to the first and last element of the queue.


## API

### Stack:

- push: adds a new node with that value to the top of the stack with an O(1) Time performance.
- pop: return the value from node from the top of the stack "Removes the node from the top of the stack".
- peek: return Value of the node located at the top of the stack.
- is empty:  Boolean indicating whether or not the stack is empty.

### Queue:  
- enqueue: adds a new node with that value to the back of the queue with an O(1) Time performance.
- dequeue: return the value from node from the front of the queue"Removes the node from the front of the queue".
- peek: Returns value of the node located at the front of the queue.
- is empty: Returns boolean indicating whether or not the queue is empty.

## Stack Check list:
- [x] Push method
- [x] Pop method
- [x] Peek method
- [x] Is Empty method
- [x] Tests 
- [ ] Structure Goals    

## Queue Check list:
- [x] enqueue method
- [x] dequeue method
- [x] Peek method
- [x] Is Empty method
- [x] Tests 
- [ ] Structure Goals
