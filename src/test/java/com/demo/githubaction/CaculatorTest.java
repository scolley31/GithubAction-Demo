package com.demo.githubaction;

import com.demo.githubaction.controller.CaculatorHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaculatorTest {


    @Test
    public void testAdd() {

        // Given a = 4, b = 5
        int a = 4;
        int b = 5;
        int expected = 9;
        // When add(a, b)
        int result = CaculatorHelper.add(a, b);
        // Then result = 9
        Assertions.assertEquals(expected, result);
    }
}
