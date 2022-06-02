package com.kunal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFindAllDuplicates {
    @Test
    public void testFindAllDuplicates() {
        assertEquals(1,FindAllDuplicates.findDuplicates(new int[] {1,1,1,2,3,4,5}));
    }
}