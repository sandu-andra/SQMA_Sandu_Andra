package sandu.andra.tests;

import org.junit.jupiter.api.Test;
import sandu.andra.classes.BasicMathematicalOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductUnitTest {

    @Test
    void testProductOperation() {
        int op1 = 2;
        int op2 = 4;
        int expectedResult = 8;
        int actualResult = BasicMathematicalOperations.productOperation(op1, op2);
        assertEquals(expectedResult, actualResult);
    }
}
