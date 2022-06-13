package com.kunal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestFindAllDuplicates {
    @Test
    public void testFindAllDuplicates() {
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        FindAllDuplicates findAllDupeInstance = new FindAllDuplicates();
        assertEquals(expectedResult,findAllDupeInstance.findDuplicates(new int[]{1,2,3,4,5,3,6,7,8,9}));
    }
}