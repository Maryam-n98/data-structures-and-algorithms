package hashtable;


import binaryTree.BinaryTree;
import binaryTree.NodeTree;

import java.util.*;

public class HashTable<K, V> {
    private ArrayList<Node<K, V>> bucketArray;

    private int numBuckets;

    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 30;
        size = 0;

        for (int index = 0; index < numBuckets; index++) {
            bucketArray.add(null);
        }
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }


    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);

        int index = hashCode % numBuckets;

        index = index < 0 ? index * -1 : index;

        return index;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }


    public void add(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

      Node<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }

            head = head.next;
        }

        size++;
        head = bucketArray.get(bucketIndex);
        Node<K, V> newNode = new Node<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<Node<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;

            for (int index = 0; index < numBuckets; index++) {
                bucketArray.add(null);
            }

            for (Node<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
       Node<K, V> head = bucketArray.get(bucketIndex);

        Node<K, V> prev = null;
        while (head != null) {
            // If Key found
            if (head.key.equals(key) && hashCode == head.hashCode)
                break;

            prev = head;
            head = head.next;
        }

        if (head == null)
            return null;

        size--;

        if (prev != null)
            prev.next = head.next;
        else
            bucketArray.set(bucketIndex, head.next);

        return head.value;
    }
    public boolean contains(K key) {
        if (key == null){
            throw new IllegalArgumentException("Cannot find a null key.");
        }
        return get(key) != null;
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        Node<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }

            head = head.next;
        }

        // key not found
        return null;
    }
    public String  repeatedWord(String strings){

        String allWords = strings.toLowerCase(Locale.ROOT);
        String [] token = allWords.split(" ");
        HashTable<String, Integer> hashMap = new HashTable<String, Integer>();


        for (String word : token){

            if(word.contains(",")){
                word = word.substring(0, word.length()-1);
            }

            if(!word.equals("")){

                int count = hashMap.get(word) != null ? hashMap.get(word) : 0;

                if (count == 1){
                    return word;
                }
                hashMap.add(word, count + 1);
            }
        }

        return "no repeated words";
    }
    public HashMap<Integer,Integer> hashMap = new HashMap<>();
    public List<Integer> intersections = new ArrayList<>();

    public List<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2){

        if (tree1.getRoot() == null || tree2.getRoot()  == null) {
            return null;
        }

        traverse(tree2.getRoot() );

        compare(tree1.getRoot() );

        return intersections;
    }

    public void traverse(NodeTree node) {

        if (node != null) {

            int count = 0 ;
            if(hashMap.get(node.getKey()) == null){
                count = 1;
            }else{
                count = count +1;
            }

            hashMap.put(node.getKey(),count);

            traverse(node.getLeft());
            traverse(node.getRight());
        }
    }

    public void compare(NodeTree node){
        if (node != null) {
            if (hashMap.get(node.getKey()) != null){
                intersections.add(node.getKey());
            }
            compare(node.getLeft());
            compare(node.getRight());
        }

    }
    public static List<String> leftJoin(HashMap h, HashMap h1){

        List<String> list = new ArrayList<>();
        for(Object k : h.keySet()){
            if(h.containsKey(k)){
                list.add(k +  ": " + h.get(k)+ ", " + h1.get(k));
            } else{
                list.add(k + ": " + h.get(k) + ", " + null);
            }
        }

        return list;
    }
}