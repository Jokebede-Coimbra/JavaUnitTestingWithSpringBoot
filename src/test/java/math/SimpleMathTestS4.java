package math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in Simple Math Test")
public class SimpleMathTestS4 {

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

    @DisplayName("Test 8.0 / 2.0 = 4.0")
    @ParameterizedTest
    @CsvSource({
            "6.2, 2, 3.1",
            "71, 14, 5.07",
            "18.3, 3.1, 5.90"
    })


  /* @CsvSource({
            "Senna, F1",
            "Pelé, Football",
            "Keith Moon, ''"
    })*/
    void testDivision(double a, double b, double expected) {

        System.out.println("Test " + a + "/" + b + "=" + expected);
        Double actual = math.division(a, b);

        assertEquals(expected, actual, 2D, () -> String.format("Expected %f but got %f", expected, actual));

    }

    // public static Stream<Arguments> testDivisionInputParameters() {
    /** public static Stream<Arguments> testDivision() {
     return  Stream.of(
     Arguments.of(6.2D, 2D, 3.1D),
     Arguments.of(71D, 14D, 5.07D),
     Arguments.of(18.3D, 3.1D, 5.90D)
     );
     }
     */


}
