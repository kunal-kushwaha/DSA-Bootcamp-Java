package com.kunal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestFindAllDuplicates {
    @Test
    public void testFindOneDuplicates() {
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        FindAllDuplicates findAllDupeInstance = new FindAllDuplicates();
        assertEquals(expectedResult,findAllDupeInstance.findDuplicates(new int[]{1,2,3,4,5,3,6,7,8,9}));
    
    }
    @Test
    public void testFindMoreThanOneDuplicates(){
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(5);
        FindAllDuplicates findAllDupeInstance = new FindAllDuplicates();
        assertEquals(expectedResult,findAllDupeInstance.findDuplicates(new int[]{2,3,4,5,6,7,2,8,9,5}));
    }
    @Test
    public void testFindNoDuplicates() {
        FindAllDuplicates findAllDupeInstance = new FindAllDuplicates();
        assertThrows(ArrayIndexOutOfBoundsException.class, () ->{
            findAllDupeInstance.findDuplicates(new int[]{ 1,3,4,5,6,2,8,9,10 });
        }); 

    }
   
}