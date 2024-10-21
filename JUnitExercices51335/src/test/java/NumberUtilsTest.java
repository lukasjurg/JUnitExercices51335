import org.example.NumberUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    NumberUtils utils = new NumberUtils();

    @ParameterizedTest
    @CsvSource({"3,true", "23,true", "311,true", "487,true", "653,true", "947,true",
            "21,false", "25,false", "100,false"})
    void testIsPrime(int number, boolean expected) {
        assertEquals(expected, utils.isPrime(number));
    }

    @ParameterizedTest
    @CsvSource({"32,true", "64,true", "2,true", "20,true", "30,true", "26,true",
            "11,false", "23,false"})
    void testIsEven(int number, boolean expected) {
        assertEquals(expected, utils.isEven(number));
    }

    @ParameterizedTest
    @CsvSource({"23,23,true", "46,23,true", "115,23,true", "184,23,true",
            "207,23,true", "230,23,true", "45,23,false", "99,23,false"})
    void testIsMultiple(int number, int divisor, boolean expected) {
        assertEquals(expected, utils.isMultiple(number, divisor));
    }
}
