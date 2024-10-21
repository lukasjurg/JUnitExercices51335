import org.example.CU;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CUTest {

    CU course;

    @BeforeEach
    void setup() {
        course = new CU("Math", 30);
        course.insertMarkCU(1, 15.0);
        course.insertMarkCU(2, 12.5);
        course.insertMarkCU(3, 8.0);
    }

    @ParameterizedTest
    @CsvSource({"1,15.0", "2,12.5", "3,8.0", "4,-1.0"})
    void testSearchStudent(int numStudent, double expectedMark) {
        assertEquals(expectedMark, course.searchStudent(numStudent));
    }

    @Test
    void testAverageCU() {
        assertEquals((15.0 + 12.5 + 8.0) / 3, course.averageCU());
    }

    @ParameterizedTest
    @CsvSource({"1,true", "2,true", "3,false"})
    void testIsApproved(int numStudent, boolean isApproved) {
        assertEquals(isApproved, course.isApproved(numStudent));
    }

    @Test
    void testInsertMarkCU() {
        course.insertMarkCU(4, 17.0);
        assertEquals(17.0, course.searchStudent(4));
    }
}
