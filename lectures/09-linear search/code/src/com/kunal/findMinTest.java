package com.kunal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findMinTest {

	@Test
	void test() {
		int arr[] = {6,9,33,77,2};
		FindMin test = new FindMin();
		int output = test.min(arr);
		assertEquals(2, output);
	}

}
