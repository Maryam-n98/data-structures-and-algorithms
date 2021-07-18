/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    private static final Stack<Integer> stack = new Stack<>();
    private static final Queue<Integer> queue = new Queue<>();
    @Test
    public void addStackTest() {
        stack.push(1);
        assertEquals(1,stack.getSize());
    }
    @Test
    public void addQueueTest(){
        queue.enqueue(2);
        queue.enqueue(4);
        assertEquals(2,queue.getSize());
    }
    @Test
    public void removeStackTest(){
        stack.push(1);
        stack.push(1);
        stack.pop();
        assertEquals(1,stack.getSize());
    }

    @Test
    public void removeQueueTest(){
        queue.enqueue(2);
        queue.enqueue(4);
        queue.dequeue();
        queue.dequeue();
        assertEquals(0,queue.getSize());
    }
    @Test
    public void peekStack(){
        stack.push(2);
        stack.push(6);
        assertEquals(6,stack.peek());
    }
    @Test
    public void peekQueue(){
        queue.enqueue(2);
        queue.enqueue(4);
        assertEquals(2,queue.peek());
    }


    @Test
    public void EmptyStackAndQueue(){
        assertNull(stack.top);
        assertNull(queue.front);
    }
}