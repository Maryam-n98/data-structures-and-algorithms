package trees;


import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTree<T> {
    Node <T> root;
    public ArrayList<Integer> preOrderArr = new ArrayList<>();
    public ArrayList<Integer> inOrderArr = new ArrayList<>();
    public ArrayList<Integer> postOrderArr = new ArrayList<>();
    public LinkedList<Node> linkedList = new LinkedList<>();
    public  ArrayList<Integer> list = new ArrayList<>();


    public BinaryTree() {
        this.root = null;
    }
   public void postorder(Node<T> node)
    {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key + " ");
        postOrderArr.add(node.key);
    }
// CODE CHALLENGE 16
    public int findMax() {
        if(root == null){
            System.out.println("this tree is Empty");
            return 0;
        }
        int max = root.key;
        preOrder(root);
        for(int i = 0; i<preOrderArr.size(); i++){
            if(max<preOrderArr.get(i)){
                max = preOrderArr.get(i);
            }
        }
        return max;
    }

   public void postorder() {
        postorder(root);
    }

   public void inorder(Node<T> node)
    {
        if (node == null)
            return;
       inorder(node.left);
        System.out.print(node.key + " ");
        inOrderArr.add(node.key);
        inorder(node.right);
    }
   public void inorder() {
        inorder(root);
    }

   public void preOrder(Node<T> node)
    {
        if (node == null)

            return;
//        System.out.print(node.key + " ");
        preOrderArr.add(node.key);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void preOrder() {
        preOrder(root);;
    }


    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }

// CODE CHALLENGE 19 INTERVIEW (2)
    public int leafNumber() {
        return leafNumber(root);
    }

    public static boolean CheckLeaf(BinaryTree tree1, BinaryTree tree2) {
        int num1 = tree1.leafNumber();
        int num2 = tree2.leafNumber();
        return num1 == num2;
    }

    public int leafNumber(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return leafNumber(node.left) + leafNumber(node.right);




    }

    public ArrayList<Integer> breadthFirst(BinaryTree tree) {
        if (root != null) {
            linkedList.add(tree.root);
            while (!linkedList.isEmpty()) {
                Node node = linkedList.remove();
                list.add(node.key);

                if (node.left != null) {
                    linkedList.add(node.left);
                }
                if (node.right != null) {
                    linkedList.add(node.right);
                }
            }
        }
        return list;
    }


}
