# Graph Breadth First

# Challenge Summary
Write a method breadth first
take Node
Return A collection of nodes in the order they were visited.
## Whiteboard Process

![gbf](https://github.com/Maryam-n98/data-structures-and-algorithms/blob/graph-breadth-first/graph/img/code36.png)
## Approach & Efficiency
Create a method that accepts a starting Node of a graph using a queue. The method returns a LinkedList of Nodes. The queue will add the children of the current node while the queue is not empty. The queue will Add to LinkedList. Also, Using the Edge class, we check if the neighbor of the current node has been visited.

