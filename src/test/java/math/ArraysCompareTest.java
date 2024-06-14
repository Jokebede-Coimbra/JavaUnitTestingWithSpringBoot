package math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysCompareTest {

    @Test
    void test() {
       int[] numbers = { 2, 1, 6, 5, 4, 3};
       int[] expectedArray = {1, 2, 3, 4, 5, 6};

        Arrays.sort(numbers);

        assertArrayEquals(numbers, expectedArray);

    }
    @Test
    // @Timeout(1)
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    void testSortPerformance() {
       int[] numbers = { 2, 1, 6, 5, 4, 3};
        for (int i = 0; i < 1000; i++) {
            numbers[0] = i;
            Arrays.sort(numbers);
        }


    }
}
