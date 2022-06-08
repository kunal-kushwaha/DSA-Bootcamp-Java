package com.kunal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {
	@Test
	void testTwentyTwoAtFirstPosition() {
		// find twenty two at the first position
		int[] arr = {22, -12, -4, 0, 2, 3, 4, 15, 16, 18, 45, 89};
		var search = new BinarySearch();
		assertEquals(10, search.binarySearch(arr, 22));
	}

	@Test
	void testTwentyTwoAtLastPosition() {
		// find twenty two at the last position
		int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 45, 22};
		var search = new BinarySearch();
		assertTrue(search.binarySearch(arr, 16) == arr.length);
	}
	
	@Test
	void testTwentyTwoAtAnyPosition() {
		// find twenty two at any position
		int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
		var search = new BinarySearch();
		assertEquals(10, search.binarySearch(arr, 22));
	}
	
	@Test
	void testTwentyTwoShouldNotFound() {
		// twenty two should not found
		int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 45, 89};
		var search = new BinarySearch();
		assertEquals(-1, search.binarySearch(arr, 22));
	}
}
