package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.tfoc.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTest {

    @Test
    @DisplayName("Should return empty array for empty input")
    void twoSumEmptyInput() {

        int[] sum = Solution.twoSum(new int[]{}, 9);
        assertEquals(0, sum.length);
    }

    @ParameterizedTest
    @CsvSource(value = {"2,7,11,15;9;0,1",
                        "1,100,2,300,4,500;504;4,5",
                        "10,17,9,18,7,16,11;21;0,6"}, delimiterString = ";")
    @DisplayName("Should return the solution for a given array")
    void twoSum(@ConvertWith(IntArrayConverter.class) int[] input, int target, @ConvertWith(IntArrayConverter.class) int[] expected) {

        int[] sum = Solution.twoSum(input, target);
        assertEquals(2, sum.length);
        assertArrayEquals(expected, sum);
    }
}