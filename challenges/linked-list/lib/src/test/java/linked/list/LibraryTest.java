/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryTest {
    LinkedList<Integer> testList;
    @BeforeEach
    public void init() {
        testList = new LinkedList<>();
    }

    @Test
    public void isEmptyTest() {
        Assertions.assertTrue( testList.size >= 0 );
    }

    @Test
    public void appendTest() {
        testList.append(5);
        testList.append(5);
        Assertions.assertTrue( testList.size == 2 );

    }


    @Test
    public void insertBeforeAndAfterTest() {
        testList.append(2);
        testList.append(3);
        testList.append(5);
        testList.insertBefore(3 , 5);
        testList.insertAfter(3 , 5);
        Assertions.assertEquals(2 , testList.head.data);
        Assertions.assertTrue(testList.size == 5);
        Assertions.assertTrue(testList.includes(5) );
        Assertions.assertFalse(testList.includes(9) );
        Assertions.assertEquals("{ 2 -> 5 -> 3 -> 5 -> 5 -> null }" , String.valueOf(testList));
    }
}
