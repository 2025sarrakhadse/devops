
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        int result = calculator.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiply(10, 5);
        assertEquals(50, result);
    }

    @Test
    public void testDivision() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        int result = calculator.add(-10, -5);
        assertEquals(-15, result);
    }

    @Test
    public void testMultiplicationByZero() {
        int result = calculator.multiply(10, 0);
        assertEquals(0, result);
    }
}
