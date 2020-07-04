# Queue
## What is a Queue?

![Queue picture](https://cdn.pixabay.com/photo/2018/03/11/15/35/duck-3217049_1280.jpg)

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
