
# Hashmap LEFT JOIN
Implement a simplified LEFT JOIN for 2 Hashmaps.

## Challenge
Write a function that LEFT JOINs two hashmaps into a single data structure.

## Whiteboard
![leftjoin](https://github.com/Maryam-n98/data-structures-and-algorithms/blob/main/hashtable/app/src/main/java/hashtable/img/code33.png)
## Approach & Efficiency
Create a method that accepts 2 hash maps as a parameter. Declare a list and iterate through each hashmap and compare the keys if it matches. If each hash map has the same key, then add the key and values to the list, otherwise add to list with the second hash map value to null.
