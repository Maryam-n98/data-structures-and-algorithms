package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    NodeTree root;

    public BinaryTree() {
        root = null;
    }

    List<Integer> postOrderList = new ArrayList<>(); // FOR TEST
    List<Integer> inOrderList = new ArrayList<>();  // FOR TEST
    List<Integer> preOrderList = new ArrayList<>(); // FOR TEST


    public void postOrder(NodeTree node){

        if(node == null){
            return;
        }

        // recur left
        postOrder(node.getLeft());

        // recur right
        postOrder(node.getRight());

        //  print the value
        System.out.print(node.getKey() + " ");
        postOrderList.add(node.getKey());
    }

    public void inOrder(NodeTree node ){

        if(node == null){
            return;
        }

        inOrder(node.getLeft());

        System.out.print(node.getKey()+" ");
        inOrderList.add(node.getKey());

        inOrder(node.getRight());

    }

    public void preOrder(NodeTree node){

        if(node == null){
            return;
        }

        System.out.print(node.getKey() + " ");
        preOrderList.add(node.getKey());

        preOrder(node.getLeft());

        preOrder(node.getRight());
    }

    public NodeTree getRoot() {
        return root;
    }

    public void setRoot(NodeTree root) {
        this.root = root;
    }

    @Override
    public String toString() {

        if(root == null){
            return "BinaryTree{ " +
                    " root = " + root + " }";

        }else if(root != null && root.getLeft() == null && root.getRight() == null){

            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + null+
                    " right = " + null+
                    " }";

        }else if(root != null && root.getLeft() != null && root.getRight() == null){
            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + root.getLeft().getKey()+
                    " right = " + null+
                    " }";

        }else if(root != null && root.getLeft() == null && root.getRight() != null){
            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + null+
                    " right = " + root.getRight().getKey()+
                    " }";
        }else{
            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + root.getLeft().getKey()+
                    " right = " + root.getRight().getKey()+
                    " }";
        }

    }
}
