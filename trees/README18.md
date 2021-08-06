# FizzBuzz
# Challenge Summary
Write a function called fizz buzz tree
Arguments: k-ary tree
Return: new k-ary tree
Determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:
If the value is divisible by 3, replace the value with “Fizz”
If the value is divisible by 5, replace the value with “Buzz”
If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
If the value is not divisible by 3 or 5, simply turn the number into a String.
## Whiteboard Process
![whiteboard](/img/code18.png)
## Approach & Efficiency
Big O(n)

## Solution
Created Node Class and KAryTree Class
created a function that take Integer and return String
Declared new variable in type KAry Class and name it kTree
Declared LinkedList type Queue 
if kTree variable not empty add kTree.root to queue then make a while that loop if the queue not empty and declred new node of type Integer that value the first element of the queue name it currentNode 
and declared String variable currentValue 
if the devide currentNode by 5 equel 0 and  devide currentNode by 3 equel 0 make currentValue  equel "FizzBuzz" else if the value of the devide of currentNode by 3 equel 0 make  currentValue  equel  "Fizz" else if the value of the devide of currentNode by 5 equel 0 make  currentValue  equel  "Buzz" else make currentValue equel the value of currentNode 
and store all the values of currentValue  in the outTree variable 
then make if statment that if the children of currentNode not empty add all the cuurentNode children in the queue 
return the value has stored all the values of the currentValue 