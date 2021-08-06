# Tree breadth first
# Challenge Summary
Write a function called breadth first
Arguments: tree
Return: list of all values in the tree, in the order they were encountered
## Whiteboard Process
![whiteboard](/img/code17.png)
## Approach & Efficiency
Big O(n)

## Solution
Create method type of arraylist take interger
that accept binay tree
first if to check if the root null or not if yes will add it to linked list then create while loop with condition linked list not empty and remove node from linked list and add it to list then  if node left not null add the left to linked list and if node right not null add the right to linked list
then will keep do this code until the condition in while execute last thing return list.