package math;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in Simple Math Test")
public class SimpleMathTestS4 {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Senna, F1", "Pelé, Football", "Keith Moon"})
    void testValueSource(String firsName) {
        System.out.println(firsName);
        assertNotNull(firsName);
    }

    @DisplayName("Test double division [ firstNumber,  secondNumber,  expected]")
    @ParameterizedTest
    /*
     @CsvSource({
     "6.2, 2, 3.1",
     "71, 14, 5.07",
     "18.3, 3.1, 5.90"
     })

     @CsvSource({
     "Senna, F1",
     "Pelé, Football",
     "Keith Moon, ''"
     })
     */
    @CsvFileSource(resources = "/testDivision.csv")
    void testDivision(double firstNumber, double secondNumber, double expected) {

        System.out.println("Test " + firstNumber + "/" + secondNumber + "=" + expected);
        Double actual = math.division(firstNumber, secondNumber);

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
