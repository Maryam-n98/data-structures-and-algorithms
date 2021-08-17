# Hash Table 

## Challenge
 Implement a Hashtable with handling collisions.

## Approach & Efficiency
The approach is to use arrays to store the keys and values.

## API
- add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
- get: takes in the key and returns the value from the table.
- contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
- hash: takes in an arbitrary key and returns an index in the collection.
- remove: take the key and removed based on it.
## Big O
- add - with reshashing, space complexity is O(n), time is 0(n) when verifying if they key exists.
- hash - average time and space are O(1). Worst time is O(n).
- contains - average time and space are O(1). Worst time is O(n).
- get - average time and space are O(1). Worst time is O(n).
- remove - with reshashing, space complexity is O(n), time is O(n) when verifying if they key exists.
