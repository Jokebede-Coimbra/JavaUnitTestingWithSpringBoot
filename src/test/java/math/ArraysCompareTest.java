package math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysCompareTest {

    @Test
    void test() {
       int[] numbers = { 2, 1, 6, 5, 4, 3};
       int[] expectedArray = {1, 2, 3, 4, 5, 6};

        Arrays.sort(numbers);

        assertArrayEquals(numbers, expectedArray);

    }
}
