package trees.fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Node <T> {
    T value;
    public List<Node> children = new ArrayList<>();

    public Node(T value) {
        this.value = value;
    }


    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(" ");
        result.append(value);
        result.append(" ");
        for (Node ch : children) {
            result.append(" ");
            result.append(ch);
        }
        result.append(" ");

        return result.toString();
    }
}
