# Queue

![Queue picture](https://cdn.pixabay.com/photo/2018/05/18/21/01/rubber-ducks-3412065_1280.jpg)

## What is a Queue?

In a queue we can only excess the first and last object. It is like a pearl of strings, you can only remove or add elements on the end or beginning. A Queue works with the FIFO System. First in first out.

You can manipulate a queue with:
- offer(e)
- poll()
- peek()

Offer will add a new Element to the queue.
Poll will remove the first Element of the queue.
peek returns the first Element, but dose not delete it.

There are also other methods with witch you can manipulate a queue, but they throw an exception if the operation fails. This operations are:
- add(e) for adding a new element.
- remove() for removing the first element.
- element() for returning the first element.

[Source Link](https://studyflix.de/informatik/queues-886)
[Source Link](https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html)

![Queue picture](https://cdn.pixabay.com/photo/2016/05/22/11/20/rubber-ducks-1408285_1280.jpg)

## How to test a Queue?

1. Max Length
	First the maximum size of the queue should be testet. Is it possible to add more elements?
	What happens to an empty queue? Things like that should be tested.
2. Adding
	Adding elements should be testet, to see if it works as expected.
3. Return the first element
	When excessing the queue do you get the expected element returned? It should be the first added.
4. Deleting
	When deleting an element, it should be the first added. This is important so you can excess all elements.

[Source Link](https://testmatick.com/queue-testing/)

![Queue picture](https://cdn.pixabay.com/photo/2018/07/09/23/41/duck-3527585_1280.jpg)

## Where is a queue used?

Queues are used where a FIFO System is needed. Like
- Request Queuing by Server
- Spotify Playlist
- Job Scheduling
- Ready Queue

![Queue picture](https://cdn.pixabay.com/photo/2019/10/18/01/25/greater-scaup-4558031_1280.jpg)

## What are Generics?

Generics are basically a space holder for a Datatype you want to use. The Generics class usually is extended with a <T>. The T is the space holder for the datatype.
So the class should look like :
	public class Generic<T>{...}

And you can use it like that in a other class:
	Generic<String> test1 = new Generic<String>();
	Generic<Integer> test1 = new Generic<Integer>();
	Generic<Float> test1 = new Generic<Float>();

	or any other datatype you want to use! Pretty cool, I would say.

![Queue picture](https://cdn.pixabay.com/photo/2017/01/22/19/06/animals-2000586_1280.jpg)

## What is code coverage by source code tests?

Code Coverage tells us how much of our code is tested. Of course you want to get a code coverage of 100%, but 80% are not bad either. The quality of the test should be better, then having a greater code coverage.  
Before using code coverage, you should implement JUnit tests.
Common ethics that are used with code coverage are:

- Function coverage: It tells us how many functions get tested.
- Statement coverage: It tells us how many statements get executed.
- Branches coverage: It tells us how many branches have been executed.
- Condition coverage: It tells us how many boolean have been tested for true and how many for false.
- Line coverage: It tells us how many lines of you code have been tested.

To use code coverage a special software is needed, for Java you can use: Atlassian Clover, Cobertura, JaCoCo

[Source Link](https://www.atlassian.com/continuous-delivery/software-testing/code-coverage)

![Queue picture](https://cdn.pixabay.com/photo/2016/05/22/11/39/rubber-ducks-1408308_1280.jpg)
