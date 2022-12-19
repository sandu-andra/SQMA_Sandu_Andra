package sandu.andra.tests;

import org.junit.jupiter.api.Test;
import sandu.andra.classes.BasicMathematicalOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionUnitTest {
    @Test
    void testAdditionOperation() {
        int op1 = 10;
        int op2 = 15;
        int expectedResult = 25;
        int actualResult = BasicMathematicalOperations.additionOperation(op1, op2);
        assertEquals(expectedResult, actualResult);
    }
}
