# Trees
A Tree is a non-linear data structure where data objects are generally organized in terms of hierarchical relationship. The structure is non-linear in the sense that, unlike Arrays, Linked Lists, Stack and Queues, data in a tree is not organized linearly.
**A binary tree** is a recursive tree data structure where each node can have 2 children at most. 
## Challenge

- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Create a Binary Tree class:
- Define a method for each of the depth first traversals:
   * pre order
   * in order
   * post order
which returns an array of the values, ordered appropriately.

- Create a Binary Search Tree class
with the following additional methods:
- Add
  * Adds a new node with that value in the correct location in the binary search tree.
- Contains
  * Returns: boolean indicating whether or not the value is in the tree at least once.
## Approach & Efficiency
Binary tree:
Big O
Searching for a specific node will also be O(n), worst case we will have to look at n items, hence the O(n) complexity.
## API
- I created a Node class that has properties for the value stored in the node, the left node, and the right node.
- In **BinaryTree** class i created a methodes for each of the depth first traversals :
First one **postorder()**  which returns an array of the values, ordered **left >> right >> root**
then  **preOrder()**  which returns an array of the values, ordered **root >> left >> right**
then  **inorder()**  which returns an array of the values, ordered **left >> root >> right**
 here i created an Arrays to use them in test.

- In **BinarySearchTree** class I created **add()** method that take int key if the root empty it will add the key.
else we need another method **traverse()**  this method takes two parameters Node current and intger key and have some if statmente if the key bigger than the current.key and inside this if we have another if that if current.right equal null make the current.right equals new Node else current equales current.right, outside the secound if insid the first if else is key smaller than or equal current.key we have if that if  current.left equal null make the current.left equals new Node else current equales current.left.

- After that we have **inorder()** to print the tree.

- The finall method is **Contains()** that will be making a search for the key if is there or isn't.\



