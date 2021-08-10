/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;
import trees.fizzBuzz.KAryTree;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    BinaryTree tree1 = new BinaryTree();

    @Test
    public void TestEmpty() {
        assertEquals("BinaryTree{root=null}", tree1.toString());
    }

    @Test
    public void TestSingle() {
        tree1.root = new Node(5);
        assertEquals("BinaryTree{root=Node{key=5, left=null, right=null}}", tree1.toString());
    }

    @Test
    public void TestChild() {
        tree1.root = new Node(5);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        assertEquals("BinaryTree{root=Node{key=5, left=Node{key=2, left=null, right=null}, right=Node{key=3, left=null, right=null}}}", tree1.toString());
    }

    @Test
    public void rootLeft() {
        tree1.root = new Node(5);
        tree1.root.left = new Node(2);
        assertEquals("BinaryTree{root=Node{key=5, left=Node{key=2, left=null, right=null}, right=null}}", tree1.toString());
    }

    @Test
    public void TestPreOrder() {
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);
        tree1.preOrder(tree1.root);
        assertEquals("[1, 2, 4, 5, 3]", String.valueOf(tree1.preOrderArr));
    }

    @Test
    public void TestPostOrder() {
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);
        tree1.postorder(tree1.root);
        assertEquals("[4, 5, 2, 3, 1]", String.valueOf(tree1.postOrderArr));
    }

    @Test
    public void TestInOrder() {
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);
        tree1.inorder(tree1.root);
        assertEquals("[4, 2, 5, 1, 3]", String.valueOf(tree1.inOrderArr));
    }

//    CODE CHALLENGE 16

    @Test

    public void maxTestEmpty() {
    BinaryTree tree = new BinaryTree();

    assertEquals(0,tree.findMax());

}

    @Test
    public void maxTest(){
        BinaryTree tree2 = new BinaryTree();

        tree2.root=new Node(10);
        assertEquals(10,tree2.findMax());

    }
    @Test
    public void maxtest1(){
        BinaryTree tree3 = new BinaryTree();
        tree3.root=new Node(10);
        tree3.root.left=new Node(7);
        tree3.root.right=new Node(15);
        assertEquals(15,tree3.findMax());

    }
    @Test
    public void maxtest2(){
        BinaryTree tree3 = new BinaryTree();
        tree3.root=new Node(10);
        tree3.root.left=new Node(9);
        tree3.root.right=new Node(11);
        tree3.root.left.left=new Node(13);
        tree3.root.left.right=new Node((1));
        assertEquals(13,tree3.findMax());

    }
    @Test
    public void breadthFirstTest() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root=new Node(1);
        binaryTree.root.left=new Node(190);
        binaryTree.root.right=new Node(130);
        binaryTree.root.left.left=new Node(4);
        binaryTree.root.left.right=new Node(200);


        assertEquals("[1, 190, 130, 4, 200]",String.valueOf(binaryTree.breadthFirst(binaryTree)));
    }
    @Test
    public void kTreeFizzBuzzTest(){

        KAryTree kTree = new KAryTree(2);

        kTree.add(1);
        kTree.add(2);
        assertEquals("{  1   2   }",kTree.fizzBuzzTree(kTree).toString() );

        kTree.add(3);
        assertEquals("{  1   2    Fizz   }", kTree.fizzBuzzTree(kTree).toString());

        kTree.add(5);
        assertEquals("{  1   2   Buzz     Fizz   }", kTree.fizzBuzzTree(kTree).toString());

        kTree.add(15);
        assertEquals("{  1   2   Buzz    FizzBuzz     Fizz   }", kTree.fizzBuzzTree(kTree).toString());

    }

}