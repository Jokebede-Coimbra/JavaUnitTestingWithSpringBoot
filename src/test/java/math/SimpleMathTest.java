package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        /*
        Double actual = math.sum(2.5, 2.5);
        double expected = 5.0;

        Assertions.assertEquals(expected, actual, "2.5 + 2.5  did not produce 5.0!");
        */

        Double a = 4.5;
        Double b = 3.5;
        Double actual = math.sum(a, b);
        double expected = 8.0;

        // Mensagem de erro lazy assert usando lambda
        assertEquals(expected, actual, () -> String.format("%.2f + %.2f did not produce %.2f!", a, b, expected));
    }

    @Test
    void testSubtraction() {
        SimpleMath math = new SimpleMath();

        Double a = 14.5;
        Double b = 4.5;
        Double actual = math.subtraction(a, b);
        double expected = 10.0;

        assertNotEquals(19.0, actual);
        assertEquals(expected, actual, () -> String.format("%.2f + %.2f did not produce %.2f!", a, b, expected));
    }

    @Test
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        Double a = 8.0;
        Double b = 2.0;
        Double actual = math.multiplication(a, b);
        double expected = 16.0;

        // Verificar se o valor calculado corresponde ao valor esperado
        assertEquals(expected, actual, () -> String.format("Expected %f but got %f", expected, actual));
    }

    @Test
    void testDivision() {
        SimpleMath math = new SimpleMath();
        Double a = 8.0;
        Double b = 2.0;
        Double actual = math.division(a, b);
        double expected = 4.0;

        assertNotNull(actual, "The result should not be null");
        assertEquals(expected, actual, () -> String.format("Expected %f but got %f", expected, actual));
        ;
    }

    @Test
    void testDivisionByZero() {
        SimpleMath math = new SimpleMath();
        Double a = 8.0;
        Double b = 0.0;
        assertThrows(IllegalArgumentException.class, () -> math.division(a, b), "Division by zero should throw IllegalArgumentException");
    }

    @Test
    void testMean() {
        SimpleMath math = new SimpleMath();
        Double a = 8.0;
        Double b = 2.0;
        Double actual = math.mean(a, b) / 2;
        double expected = 2.5;

        assertEquals(expected, actual, () -> String.format("Expected %.2f but got %.2f", expected, actual));
    }

    @Test
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        Double a = 9.0;
        Double actual = math.squareRoot(a);
        double expected = 3.0;

        assertEquals(expected, actual, () -> String.format("Expected %.2f but got %.2f", expected, actual));
    }
}
