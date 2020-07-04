# Queue

![Queue picture](https://cdn.pixabay.com/photo/2018/05/18/21/01/rubber-ducks-3412065_1280.jpg)

## What is a Queue?

In a queue we can only exzesse the first and last object. It is like a pearl of strings, you can only remove or add elements on the end or beginning. A Queue works with the FIFO System. First in first out. 

You can manipulate a queue with:
- offer(e) 
- poll()
- peek()

Offer will add a new Element to the queue.
Poll will remove the first Element of the queue.
peek returns the first Element, but dose not delet it. 

There are also other methodes with witch you can manipulte a queue, but they throw an exeption if the operation fails. This operations are:
- add(e) for adding a new element.
- remove() for removing the first element.
- element() for returning the first element. 

![Queue picture](https://cdn.pixabay.com/photo/2016/05/22/11/20/rubber-ducks-1408285_1280.jpg)

## How to test a Queue?

1. Max Length
	First the maximum size of the queue should be testet. Is it possible to add more elements?
	What happens to an empty queue? Things like that should be tested.
2. Adding
	Adding elements should be testet, to see if it works as expected.
3. Return the first element
	When exessing the queue do you get the explected element returned? It should be the first added.
4. Deleting
	When deleting an element, it should be the first added. This is important so you can exess all elements. 
	