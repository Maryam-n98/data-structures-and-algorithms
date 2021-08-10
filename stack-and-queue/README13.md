
# Challenge Summary
# Code Challenge 13 
## Multi-bracket Validation.

- Write a function called **validate brackets**
- Arguments: string
- Return: boolean (TRUE OR FALSE)
- representing whether or not the brackets in the string are balanced.

## Whiteboard Process
![whiteboard](/img/code13.png)


## Approach & Efficiency
- First we declered new Stack called leftChar
- we wrote for loop to loop in character lenght 
- inside it we wrote if statment that When we see an open bracket we will push the bracket to the stack, it is now being tracked. 
- It must be closed by the appropriate bracket at some point or else we have a problem.
- if inside it if the Stack is empty return false because its not closed
- if When we see a closing bracket, we peek at the top of the stack to make sure it is the correct type of opening bracket.
- If it is another closing bracket or the wrong type or there is no bracket then we will return false, the parentheses set is not balanced 
- If we get through the whole string without a mismatch then the set is balanced
- Finall return leftChar isEmpty it will return True and its not Empty it will return False.


 ###### In this code challenge, I worked with "Motasim Al Azzam" as a partner.      
 ###### We used in this code this video as a Reference:
 [https://www.youtube.com/watch?v=CCyEXcNamC4&ab_channel=BackToBackSWE](https://www.youtube.com/watch?v=CCyEXcNamC4&ab_channel=BackToBackSWE)
