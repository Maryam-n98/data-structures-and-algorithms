/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;


public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
//        for test main
        System.out.println("maryam");

        LinkedList linkedList = new LinkedList(new Node(1,null));
        linkedList.insert(new Node(2,null));
        linkedList.insert(new Node(3,null));
        linkedList.insert(new Node(4,null));
//        System.out.println(linkedList);
        linkedList.show();
//        4 include so it will print true
        if(linkedList.search(linkedList.head,4)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
//        5 it not include so it will print false
        if(linkedList.search(linkedList.head,5)){

            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.print(linkedList);
    }
    }
