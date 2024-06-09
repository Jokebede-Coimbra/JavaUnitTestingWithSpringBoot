package math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        // Mensagem de erro preguiçosa usando lambda
        Assertions.assertEquals(expected, actual, () -> String.format("%.2f + %.2f did not produce %.2f!", a, b, expected));
    }
}
