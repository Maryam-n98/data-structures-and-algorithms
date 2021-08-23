package binaryTree;

public class NodeTree<T>{
    private final int key;
    private NodeTree<T> left;
    private NodeTree<T> right;

    public NodeTree(int key) {
        this.key = key;
        left = right = null;
    }

    public int getKey() {
        return key;
    }

    public NodeTree<T> getLeft() {
        return left;
    }

    public void setLeft(NodeTree<T> left) {
        this.left = left;
    }

    public NodeTree<T> getRight() {
        return right;
    }

    public void setRight(NodeTree<T> right) {
        this.right = right;
    }

}
