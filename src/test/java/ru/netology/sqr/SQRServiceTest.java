package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'test data',200,300,3",
            "'0 number in the range',230,250,0",
            "'1 number in the range',200,250,1",
            "'40 number in the range',200,3000,40",
            "'max limit number in the range',100,9801,90"
    })
    void shouldCalculateNumberSquaresHitTheRange(String testName, int upperBorder, int bottomBorder, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateNumberSquares (upperBorder, bottomBorder);
        assertEquals(expected, actual);
    }
}
