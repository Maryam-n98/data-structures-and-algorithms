

# Challenge Summary
- Create a class called AnimalShelter which holds only dogs and cats.
- The shelter operates using a first-in, first-out approach.
- Implement the following methods:
#### enqueue
Arguments: animal
animal can be either a dog or a cat object.
#### dequeue
Arguments: pref
pref can be either "dog" or "cat"
###### Return: either a dog or a cat, based on preference.
If pref is not "dog" or "cat" then return null.



## Whiteboard Process
![whiteboard](/img/code12.png)


## Approach & Efficiency
- created Animal Class as a parent for Cat and  Dog Classes
- in AnimalShelter class we make new Queue type Cat class "catQ" and new Queue type Dog class "dogQ"
- writed enqueue that have if statment if instance of Cat so enqueue cat by determining the type of the animal as a cat else if instance of Dog so enqueue dog by determining the type of the animal as a dog else you cant enqueue 
- have another method to delete one of cats or dogs that call dequeue have paramiter pref to determining if you want to delete cat or dog so we have if satmente that if the pref equels Cat and the cat queue is not empty so retuen dequeue of cat queue "catQ" else if the pref equels Dog and the dog queue is not empty so retuen dequeue of dog queue "dogQ" else return null becouse we havent any type exbected the cat or dog.



## Check List Code Challenge 12:
 - [x] Top-level README “Table of Contents” is updated
 - [x] README for this challenge is complete
 - [x] Summary, Description, Approach & Efficiency
 - [x] Picture of whiteboard
 - [x] Link to code
 - [x] Feature tasks for this challenge are completed
 - [x] Unit tests written and passing
 - [x] “Happy Path” - Expected outcome
 - [x] Expected failure
 - [x] Edge Case (if applicable/obvious)


 ###### In this code challenge, I worked with "Motasim Al Azzam" as a partner.      