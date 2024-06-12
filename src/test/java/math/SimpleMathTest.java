package math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in Simple Math Test")
public class SimpleMathTest {

    SimpleMath math;

    @BeforeAll
    static void setup() {
        System.out.println("Running @BeforeAll method!");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll method!");
    }

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("Running @AfterEach method!");
    }

    @Test
    @DisplayName("Test 4.5 + 3.5 = 8.0")
    void testSum() {
        // SimpleMath math = new SimpleMath();
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
    @DisplayName("Test 14.5 - 4.5 = 10.0")
    void testSubtraction() {
        // Given
        // SimpleMath math = new SimpleMath();

        Double a = 14.5;
        Double b = 4.5;
        double expected = 10.0;

        // When
        Double actual = math.subtraction(a, b);

        // Then
        assertNotEquals(19.0, actual);
        assertEquals(expected, actual, () -> String.format("%.2f + %.2f did not produce %.2f!", a, b, expected));
    }

    @Test
    @DisplayName("Test 8.0 * 2.0 = 16.0")
    void testMultiplication() {
        //SimpleMath math = new SimpleMath();
        Double a = 8.0;
        Double b = 2.0;
        Double actual = math.multiplication(a, b);
        double expected = 16.0;

        // Verificar se o valor calculado corresponde ao valor esperado
        assertEquals(expected, actual, () -> String.format("Expected %f but got %f", expected, actual));
    }

    @Test
    @DisplayName("Test 8.0 / 2.0 = 4.0")
    void testDivision() {
        //SimpleMath math = new SimpleMath();
        Double a = 8.0;
        Double b = 2.0;
        Double actual = math.division(a, b);
        double expected = 4.0;

        assertNotNull(actual, "The result should not be null");
        assertEquals(expected, actual, () -> String.format("Expected %f but got %f", expected, actual));
        ;
    }

    @Test
    @DisplayName("Test Division by Zero")
    void testDivisionByZero() {
        //SimpleMath math = new SimpleMath();
        Double a = 8.0;
        Double b = 0.0;
       // assertThrows(IllegalArgumentException.class, () -> math.division(a, b), "Division by zero should throw IllegalArgumentException");

        // When & Then
        assertThrows(ArithmeticException.class, () -> {
            // When & Then
            math.division(a, b);
        });
    }

    @Test
    @DisplayName("Test (8.0 + 2.0) / 2 = 2.5")
    void testMean() {
        //SimpleMath math = new SimpleMath();
        Double a = 8.0;
        Double b = 2.0;
        Double actual = math.mean(a, b) / 2;
        double expected = 2.5;

        assertEquals(expected, actual, () -> String.format("Expected %.2f but got %.2f", expected, actual));
    }

    @Test
    @DisplayName("Test Square Root of 9  = 3")
    void testSquareRoot() {
        // SimpleMath math = new SimpleMath();
        Double a = 9.0;
        Double actual = math.squareRoot(a);
        double expected = 3.0;

        assertEquals(expected, actual, () -> String.format("Expected %.2f but got %.2f", expected, actual));
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Display Name")
    @Test
    void testABCD_when_XYZ_Should() {
        // Given / Arrange
        // When / Act
        // Then / Assert
    }
}
