package com.kunal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {
	int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};

	@Test
	void testTwentyTwoFindAtTenthPosition() {
		var search = new BinarySearch();
		assertEquals(10, search.binarySearch(arr, 22));
	}

	@Test
	void testSixteenFindAtEighthPosition() {
		var search = new BinarySearch();
		assertTrue(search.binarySearch(arr, 16) == 8);
	}
	
	@Test
	void testOneHundredShouldNotFound() {
		var search = new BinarySearch();
		assertEquals(-1, search.binarySearch(arr, 100));
	}
}
