package sandu.andra.tests;

import org.junit.jupiter.api.Test;
import sandu.andra.classes.BasicMathematicalOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareUnitTest {

    @Test
    void testSquareOperation() {
        int op = 5;
        int expectedResult = 25;
        int actualResult = BasicMathematicalOperations.squareOperation(op);
        assertEquals(expectedResult, actualResult);
    }
}
