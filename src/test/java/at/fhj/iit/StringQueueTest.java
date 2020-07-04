package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Class testing the function of the StringQueue Constructors using JUnit tests.
 * 
 * @author Sarah Graschl
 * @since  03.07.2020
 */

class StringQueueTest {

	@Test
	@DisplayName("Testing constructor offer")
	public void testOffer() {
		StringQueue testFalse = new StringQueue(0);
		StringQueue testTrue = new StringQueue(4);
		boolean offerFalse = testFalse.offer("testF");
		boolean offerTrue = testTrue.offer("testT");
		assertEquals(false, offerFalse);
		assertEquals(true, offerTrue);
	}
	
	@Test
	@DisplayName("Testing constructor peek")
	public void peek() {
		StringQueue testNull = new StringQueue(5);
		String peekNull = testNull.peek();
		assertEquals(null, peekNull);
		
		StringQueue testElement = new StringQueue(1);
		testElement.offer("test");
		String peekElement = testElement.peek();
		assertEquals("test", peekElement);
	}
	
	@Test
	@DisplayName("Testing constructor element")
	public void element() {
		StringQueue testElement = new StringQueue(1);
		testElement.offer("test");
		String elementElement = testElement.peek();
		assertEquals("test", elementElement);
		
		assertThrows(NoSuchElementException.class, () -> {
			StringQueue testNull = new StringQueue(5);
			testNull.element();
	    });
				
	}
	
	@Test
	@DisplayName("Testing constructor poll")
	public void testPoll() {
		StringQueue testPoll = new StringQueue(1);
		testPoll.offer("test");
		String pollTest = testPoll.poll();
		assertEquals("test", pollTest);
		
		StringQueue testPollNull = new StringQueue(1);
		String pollTestNull = testPollNull.poll();
		assertEquals(null, pollTestNull);
	}
	
	@Test
	@DisplayName("Testing constructor remove")
	public void remove() {
		StringQueue testElement = new StringQueue(1);
		testElement.offer("test");
		String elementElement = testElement.remove();
		assertEquals("test", elementElement);
		
		assertThrows(NoSuchElementException.class, () -> {
			StringQueue testNull = new StringQueue(5);
			testNull.remove();
	    });
	}
}
