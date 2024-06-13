package math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in Simple Math Test")
public class DemoRepeatedTest {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }

    @RepeatedTest(value = 3, name = "{displayName}. Repetition " + " {currentRepetition} of {totalRepetitions}!")
    @DisplayName("Test Division by Zero")
    void testDivisionByZero(RepetitionInfo repetitionInfo, TestInfo testInfo) {

        System.out.println("Repetition N°" + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("Running " + testInfo.getTestMethod().get().getName());
        Double firstNumber = 8.0;
        Double secondNumber = 0.0;

        // When & Then
        assertThrows(ArithmeticException.class, () -> {
            // When & Then
            math.division(firstNumber, secondNumber);
        });
    }

}
