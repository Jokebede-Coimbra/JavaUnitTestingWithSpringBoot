package math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        Double actual = math.sum(2.5, 2.5);
        double expected = 5.0;

        Assertions.assertEquals(expected, actual);
    }
}
