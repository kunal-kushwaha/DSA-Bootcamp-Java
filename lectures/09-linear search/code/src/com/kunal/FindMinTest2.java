package com.kunal;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMinTest2 {
    
		@Test
		// Partition 1: Find Min at the Final Posittion 
		// Such as final 
	    public void findMinAtFinalPosition() {
		
			int arr[] = {6,9,3,5,2};
			FindMin test = new FindMin();
			int output = test.min(arr);
			assertEquals(2, output);
		}
	    
	    @Test
	 // Partition 2: Is the min value at first position in the array
	    public void findMinAtFirstPosition() {
	    	
			int arr[] = {-5,9,3,7,2};
			FindMin test = new FindMin();
			int output = test.min(arr);
		    assertEquals(-5, output);
		}


	    @Test
	    // Partition 3: Is the min value at mid position in the array
	    public void findMinAtMidPosition() {
		
			int arr[] = {10,9,-5,7,2};
			FindMin test = new FindMin();
			int output = test.min(arr);
			assertEquals(-5, output);
		}
		

	    @Test
	 // Partition 4: Is the min value at any position in the array
	    public void findMinAtAnyPosition() {
			int arr[] = {1,9,7,-5,2};
			FindMin test = new FindMin();
			int output = test.min(arr);
			assertEquals(-5, output);
		}
}
