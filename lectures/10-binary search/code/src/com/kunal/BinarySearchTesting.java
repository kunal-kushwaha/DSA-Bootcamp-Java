package com.kunal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTesting {
	@Test
	void testTwentyTwoFindAtZerothPosition() {
		//Partition 1: Element at the zeroth position
		BinarySearch search = new BinarySearch();
		int[] arr = {22, -12, -4, 0, 2, 3, 4, 15, 16, 18, 45, 89};
		assertEquals(0, search.binarySearch(arr, 22));
	}

	@Test
	void testTwentyTwoFindAtLastPosition() {
		//Partition 2: Element at the last position
		BinarySearch search = new BinarySearch();
		int[] arr = {86, -12, -4, 0, 2, 3, 4, 15, 16, 18, 45, 22};
		assertTrue(search.binarySearch(arr, 22) == 11);
	}

	@Test
	void testTwentyTwoFindAtAnyPosition() {
		//Partition 3: Element at any position
		BinarySearch search = new BinarySearch();
		int[] arr = {86, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 44};
		assertEquals(10, search.binarySearch(arr, 22));
	}

	@Test
	void testTwentyTwoShouldNotFound() {
		//Partition 4: Element not in the array
		BinarySearch search = new BinarySearch();
		int[] arr = {86, -12, -4, 0, 2, 3, 4, 15, 16, 18, 45, 44};
		assertEquals(-1, search.binarySearch(arr, 22));
	}
}
