package sandu.andra.tests;

import org.junit.jupiter.api.Test;
import sandu.andra.classes.BasicMathematicalOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionUnitTest {
    @Test
    void testSubtractionOperation() {
        int op1 = 15;
        int op2 = 5;
        int expectedResult = 10;
        int actualResult = BasicMathematicalOperations.subtractionOperation(op1, op2);
        assertEquals(expectedResult, actualResult);
    }

}
