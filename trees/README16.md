# Maximum Value of Binary Tree
# Challenge Summary
find maximum value
Arguments: none
Returns: number
Find the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.
## Whiteboard Process
![whiteboard](/img/code16.png)
## Approach & Efficiency
Big O(n)

## Solution
created findMax method that return integer number have if statment that if root equel null it will return zero and print a string that till you it an Empty tree else declerd a new variable and make it equel the key of root insid it used preOrder method and its takes the root, have for loop to looping for all element that will be stored in the preOrderArr its an array list have all element of the tree iside this for we have if statment taht if the max smaller than the element in the preOrderArr make the max equel this element when this for finished return the max