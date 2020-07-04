# Queue
## What is a Queue?

<<a href="https://pixabay.com/users/RichardMc-1834381/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=image&amp;utm_content=2317143">Richard Mcall</a> from <a href="https://pixabay.com/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=image&amp;utm_content=2317143">Pixabay</a>>

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
