package trees.fizzBuzz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KAryTree <T> {

    Node root=null;
    int nodes = 0;
    int K=0;


    public KAryTree(int k) {
        if(k<=1)
            k=2;
        this.K = k;
    }

    public boolean isEmpty() {

        return root == null;
    }

    public boolean isNotEmpty(){
        return root != null;
    }

    public void add(T value){
        nodes++;
        Node newNode = new Node(value);
        if( isEmpty()){
            root = newNode;
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            Node currentNode = queue.poll();
            if(currentNode.children.size() < this.K){
                currentNode.addChild(newNode);
                return;
            }
            else {
                queue.addAll(currentNode.children);
            }
        }
    }

    public  KAryTree<String> fizzBuzzTree(KAryTree<Integer> kTree){
        KAryTree<String> outTree = new KAryTree(kTree.K);

        Queue<Node> queue = new LinkedList<>();
        if(kTree.isNotEmpty()){
            queue.add(kTree.root);
            while(!queue.isEmpty()){

                Node<Integer> currentNode = queue.poll();

                String currentValue;
                if(currentNode.value % 3 == 0 && currentNode.value % 5 ==0 )
                    currentValue = "FizzBuzz";
                else if((int)currentNode.value % 3 == 0)
                    currentValue="Fizz";
                else if((int)currentNode.value % 5 == 0)
                    currentValue="Buzz";
                else
                    currentValue=currentNode.value.toString();

                outTree.add(currentValue);

                if(! currentNode.children.isEmpty())
                    queue.addAll(currentNode.children);
            }
        }
        return outTree;
    }


    @Override
    public String toString() {
        return '{'+
              " "+ root +
//                "" + nodes +
                '}';
    }
}
