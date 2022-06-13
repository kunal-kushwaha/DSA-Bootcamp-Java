package com.kunal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	void testElementinLastPosition() {
		Max test = new Max();
		int[] arr = {1, 3, 2, 9, 18}; 		
		assertEquals(18,test.maxRange(arr,2,4));
	}
	
	@Test
	void testMaxElementinFirstPosition() {
		//test Max Element in First Position of the specified in Range//
		Max test = new Max();
		int[] arr = {1, 3, 18, 9, 2}; 		
		assertEquals(18,test.maxRange(arr,2,4));
	}
	
	@Test
	void testMaxElementinAnyPosition() {
		//test Max Element in Any Position of the specified in Range//
		Max test = new Max();
		int[] arr = {1, 3, 2, 18, 9}; 		
		assertEquals(18,test.maxRange(arr,2,4));	
		
	}
}