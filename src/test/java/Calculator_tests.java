import org.junit.jupiter.api.Test;
import org.example.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Calculator_tests {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testsubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(6, 5));
    }

    @Test
    void testdivision() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.division(25, 5), "should equal 5");
    }

    @Test
    void testdivisionByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.division(25, 0));
    }
}