package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * This class is a test class for the GenericsQueue class.
 *
 * @author Sarah Graschl
 * @since  04.07.2020
*/

class GenericsTestString {

	/**
	 * we try to get both a true and a false test chase
	 * false: if the max Size equals the size of the list, it returns false (making sure the list dose not get bigger than the max Size)
	 * true: if the max Size doese not equal the list of the size it returns ture.
	 */
	@Test
	@DisplayName("Testing constructor offer")
	public void testOffer() {
		GenericsQueue<String> testFalse = new GenericsQueue<>(0);
		boolean offerFalse = testFalse.offer("test");
		assertEquals(false, offerFalse);
		
		GenericsQueue<String> testTrue = new GenericsQueue<String>(4);
		boolean offerTure = testTrue.offer("test");
		assertEquals(true, offerTure);
	}

	/**
	 * null: if the size of the list is 0, we get returned null
	 * element: otherwise we get the element at position 0 returned
	 */
	@Test
	@DisplayName("Testing constructor peek")
	public void testPeek() {
		GenericsQueue<String> testNull = new GenericsQueue<String>(5);
		assertEquals(null, testNull.peek());
		
		GenericsQueue<String> testElement = new GenericsQueue<String>(1);
		testElement.offer("test");
		assertEquals("test", testElement.peek());
	}

	/**
	 * element: if the size of the list is greater than 0, we get returned the element at postion 0
	 * Exception: otherwise a exception gets thrown
	 */
	@Test
	@DisplayName("Testing constructor element")
	public void testElement() {
		GenericsQueue<String> testElement = new GenericsQueue<String>(1);
		testElement.offer("test");
		assertEquals("test", testElement.peek());
		
		assertThrows(NoSuchElementException.class, () -> {
			GenericsQueue<String> testNull = new GenericsQueue<String>(5);
			testNull.element();
	    });	
	}

	/**
	 * element: if the size of the list is greater than 0, we get returned the element at postion 0
	 * null: if the list is empty we get null returned
	 */
	@Test
	@DisplayName("Testing constructor poll")
	public void testPoll() {
		GenericsQueue<String> testPoll = new GenericsQueue<String>(1);
		testPoll.offer("test");
		assertEquals("test", testPoll.poll());
		
		GenericsQueue<String> testPollNull = new GenericsQueue<String>(1);
		assertEquals(null, testPollNull.poll());
	}

	/**
	 * element: if the size of the list is greater than 0, we get returned the element at postion 0
	 * exception: if the null is returned by poll a exception is thrown.
	 */
	@Test
	@DisplayName("Testing constructor remove")
	public void remove() {
		GenericsQueue<String> testElement = new GenericsQueue<String>(1);
		testElement.offer("test");
		assertEquals("test", testElement.remove());
		
		assertThrows(NoSuchElementException.class, () -> {
			GenericsQueue<String> testNull = new GenericsQueue<String>(5);
			testNull.remove();
	    });
	}
}
